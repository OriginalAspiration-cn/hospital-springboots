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
    private MenuService service;
    @Autowired
    public indexController(MenuService service){
        this.service=service;
    }
    //菜单
    @RequestMapping("/ind")
    public String index(HttpSession session, Model model){
        SysUser loginUser= (SysUser) session.getAttribute(ProjectParameter.SESSION_USER);
        if (loginUser!=null){
            //登录
//            int roleId=loginUser.getId();
            List<MenuVo> listMenu=this.service.MenuVo();
            //把菜单通过request传到页面
            model.addAttribute("listMenu",listMenu);
            model.addAttribute("loginUser",loginUser);
            //转发
            return "/index";
        }else {
            //未登录
            //重定向 到项目的根路径 跳转到login页面
            return "redirect:/";
        }
    }

    //欢迎页面
    @RequestMapping("/home")
    public String home(){
        return "basic/home";
    }

}
