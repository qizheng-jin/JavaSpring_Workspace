package com.myweb.service;

import com.myweb.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findAll();
    int addNew(User user);
    int updateName(int id, String name);
}
