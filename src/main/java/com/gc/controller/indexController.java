package com.gc.controller;

import com.gc.po.SysUser;
import com.gc.service.MenuService;
import com.gc.util.ProjectParameter;
import com.gc.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class indexController {


   //主页面
    @RequestMapping("/ind")
    public String index(){
            return "/index";
    }

    //欢迎页面
    @RequestMapping("/home")
    public String home(){
        return "redirect:/ind";
    }


}
