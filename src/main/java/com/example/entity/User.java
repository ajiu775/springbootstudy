package com.example.entity;

import lombok.Data;
import org.springframework.stereotype.Component;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @program: study
 * @description: user entity
 * @author: Allen
 * @create: 2020-04-10 21:32
 **/
@Data
@Component
public class User {
    private Integer id;
    @NotNull
    @Size(min=5,message="username must be at least 8 characters long")
    private String username;
    @NotNull
    @Size(min=8,message="password must be at least 8 characters long")
    private String password;
    @NotNull
    @Size(min=8,message="email must be at least 8 characters long")
    private String email;
    @NotNull
    @Size(min=8,message="username must be at least 8 characters long")
    private Short age;
    @NotNull
    @Size(min=8,message="sex must be at least 8 characters long")
    private String sex;
    @NotNull
    @Size(min=11,max=11,message="tel must be 11 characters long")
    private String tel;
    @NotNull
    private String address;
    @NotNull
    @Size(min=18,max=18,message="card must be 18 characters long")
    private String card;
}
