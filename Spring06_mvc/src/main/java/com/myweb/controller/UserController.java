package com.myweb.controller;

import com.myweb.pojo.User;
import com.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private User user;

    public void addUser(){
        userService.addUser(user);
    }
}
