package com.myweb.dao;

import com.myweb.pojo.User;

public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(User user) {
        System.out.println("添加用户 " + user);
    }
}
