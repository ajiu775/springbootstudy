package com.example.controller;

import com.example.dao.UserDao;
import com.example.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@Slf4j
public class RegisterController {
    @Resource
    private User user;

    @Resource
    private UserDao userDao;

    @RequestMapping(value = "/toRegister", method = RequestMethod.GET)
    public String toRegister(Model model) {
        model.addAttribute("user",new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(User user) {
        this.user = user;
        Integer count = userDao.insert(user);
        log.info(String.valueOf(count));
        return "successRegister";
    }
}
