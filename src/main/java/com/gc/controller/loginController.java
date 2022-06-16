package com.gc.controller;

import com.gc.mapper.UserMapper;
import com.gc.po.SysUser;
import com.gc.util.ProjectParameter;
import com.gc.util.Tools;
import com.gc.vo.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {
    private UserMapper userMapper;
    @Autowired(required = false)
    public loginController (UserMapper userMapper){
        this.userMapper=userMapper;
    }
    //登录页面
    @RequestMapping("/user/login")
    public String toLogin(){
        return "login";
    }
    /*
      登录的方法
       */
    @RequestMapping(value = "LoginPage",produces = "application/json;charset=utf-8")
    @ResponseBody
    public JsonMsg LoginPage(HttpSession session, String username, String password){
        JsonMsg jsonMsg=new JsonMsg();
        if(Tools.isNotNull(username)){
            if(Tools.isNotNull(password)){
                //调用service层
                SysUser dbUser=this.userMapper.selectName(username);
                //判断是否查询出用户数据
                if(dbUser!=null){
                    //判断密码是否正确
                    if(dbUser.getCode().equals(password)){
                        //登录成功
                        // 把dbUser保存到session中
                        session.setAttribute(ProjectParameter.SESSION_USER,dbUser);
                        jsonMsg.setState(true);
                        jsonMsg.setMsg("登录成功");
                    }else {
                        jsonMsg.setMsg("输入的密码错误");
                    }
                }else {
                    jsonMsg.setMsg("输入了错误的用户名，无查找。");
                }
            }else {
                jsonMsg.setMsg("请输入密码?");
            }
        }else {
            jsonMsg.setMsg("请输入用户名?");
        }
        return jsonMsg;
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
