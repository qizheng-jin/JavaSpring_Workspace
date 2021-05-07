package com.myweb.service;

import com.myweb.pojo.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();
    int addNew(User user);

}
