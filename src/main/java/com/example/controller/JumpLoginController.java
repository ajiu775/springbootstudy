package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: study
 * @description:
 * @author: Allen
 * @create: 2020-10-12 18:54
 **/
@Controller
public class JumpLoginController {

    @RequestMapping(value = "/deng", method = RequestMethod.GET)
    public String forward(){
        return "login";
    }

}
