package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: study
 * @description: login page
 * @author: Allen
 * @create: 2020-04-10 21:34
 **/
@Controller
public class Welcome {
    @RequestMapping("/index")
    public String sayHello(){
        return "/index";
    }
}
