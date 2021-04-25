package com.myweb.controller;

import com.myweb.pojo.User;
import com.myweb.service.UserService;

/**
 * controller要注入userService
 */
public class UserController {

    private UserService userService;
    private User user;

    public void addUser(){
        userService.addUser(user);

    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public User getUser() {
        return user;
    }
}
