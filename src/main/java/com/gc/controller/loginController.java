package com.gc.controller;

import com.gc.mapper.UserMapper;
import com.gc.po.SysUser;
import com.gc.util.ProjectParameter;
import com.gc.util.Tools;
import com.gc.vo.JsonMsg;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {

    //登录页面
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    /*
      登录的方法
       */
    //登录
    @RequestMapping("/login")
    public String login(String username, String password, Model model) {
        //获取当前的用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户的登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            subject.login(token);//执行登录的方法，没有异常就说明OK了
            return "redirect:/ind";
        } catch (UnknownAccountException e) {//用户名不存在
            model.addAttribute("msg", "用户名不存在或者用户名输入错误");
            return "login";
        } catch (IncorrectCredentialsException e) {//密码不存在
            model.addAttribute("msg", "密码不存在或者密码输入错误");
            return "login";
//        }catch (LockedAccountException lae){//判断用户输入的密码是否超过五次
//            model.addAttribute("msg","该用户输入错误密码超过五次已被锁死，请联系管理员进行修改");
//            return "login";
        }
    }

    //忘记密码页面
    @RequestMapping("/paw")
    public String forget(){
        return "forget/password";
    }

    //退出
    @RequestMapping("/logout")
    public String logUot(HttpSession session){
        session.removeAttribute(ProjectParameter.SESSION_USER);
        return "login";
    }
}
