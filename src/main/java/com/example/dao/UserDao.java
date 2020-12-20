package com.example.dao;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User getUser(String userName,String password);
    Integer insert(User user);
}
