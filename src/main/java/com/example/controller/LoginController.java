package com.example.controller;

import com.example.entity.User;
import com.example.serviceimp.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @program: study
 * @description: login controller
 * @author: Allen
 * @create: 2020-04-11 10:55
 **/
@Controller
public class LoginController {

    @Resource
    private LoginServiceImp loginServiceImp;

    @Resource
    private User user;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String name, String password) {
        User user = loginServiceImp.login(name, password);
        if (user.getPassword().equals(password)) {
            return "success";
        } else {
            return "fail";
        }
    }
}
