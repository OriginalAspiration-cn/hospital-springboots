package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class brcxController {
    @RequestMapping("/brcx")
    public String l(){
        return "brcx";
    }
}
