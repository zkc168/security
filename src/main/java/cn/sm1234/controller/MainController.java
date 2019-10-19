package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/login")
    public String login(){
        return "/product/login";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
