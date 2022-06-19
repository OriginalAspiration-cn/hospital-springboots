package com.gc.config;

import com.gc.mapper.UserMapper;
import com.gc.po.SysUser;
import com.gc.service.MenuService;
import com.gc.util.ProjectParameter;
import com.gc.vo.MenuVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MenuService service;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行=》授权doGetAuthorizationInfo");
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行=》认证doGetAuthenticationInfo");

        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        //用户名密码去数据库中取
        SysUser user = userMapper.selectName(userToken.getUsername());

        if (user == null) {
            return null;
        }

        Subject currentSubject = SecurityUtils.getSubject();
        Session session = currentSubject.getSession();
        session.setAttribute("loginUser", user);//登录
        List<MenuVo> listMenu=this.service.MenuVo();
        //把菜单通过request传到页面
        session.setAttribute("listMenu",listMenu);

        return new SimpleAuthenticationInfo(user, user.getCode(), "");
    }
}
