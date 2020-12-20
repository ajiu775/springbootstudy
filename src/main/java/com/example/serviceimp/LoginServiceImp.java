package com.example.serviceimp;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.services.LoginService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: study
 * @description: login implement
 * @author: Allen
 * @create: 2020-04-11 10:46
 **/
@Component
public class LoginServiceImp implements LoginService {

    @Resource
    private UserDao userDao;

    @Override
    public User login(String name, String password) {
        return userDao.getUser(name, password);
    }
}
