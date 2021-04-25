package com.myweb.service;

import com.myweb.dao.UserDao;
import com.myweb.pojo.User;

public class UserServiceImpl implements UserService{

    private UserDao userDao;//基于Spring注入dao, 面向接口变成

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
