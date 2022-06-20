package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    //用户管理页面
    @RequestMapping("/user")
    public String user(){
        return "basic/user";
    }

}
