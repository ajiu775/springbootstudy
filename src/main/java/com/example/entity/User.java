package com.example.entity;

import org.springframework.stereotype.Component;

/**
 * @program: study
 * @description: user entity
 * @author: Allen
 * @create: 2020-04-10 21:32
 **/
@Component
public class User {
    private Integer user_id;
    private String userName;
    private String password;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
