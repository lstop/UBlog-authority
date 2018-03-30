package com.lstop.blog.controller;

import com.lstop.blog.entity.AuUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuUserController {

    @RequestMapping("/")
    public String gotoIndexPage(Model model) {
        model.addAttribute("username","lstop");
        return "index";
    }
    @RequestMapping("/one")
    public String gotoOne(){
        System.out.println("at one=======================");
        return "one";
    }
    @RequestMapping("/two")
    public String gotoTwo(){
        System.out.println("at two=======================");
        return "two";
    }
}
