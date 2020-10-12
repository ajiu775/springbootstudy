package com.example.serviceimp;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: study
 * @description: login implement
 * @author: Allen
 * @create: 2020-04-11 10:46
 **/
@Component
public class LoginServiceImp implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String name, String password) {
        return userDao.getUser(name, password);
    }
}
