package com.example.services;

import com.example.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: study
 * @description: login
 * @author: Allen
 * @create: 2020-04-10 23:05
 **/
@Component
public interface LoginService {
    User login(String name,String password);
}
