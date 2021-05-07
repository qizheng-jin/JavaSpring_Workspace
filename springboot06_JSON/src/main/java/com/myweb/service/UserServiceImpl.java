package com.myweb.service;

import com.myweb.controller.UserController;
import com.myweb.mapper.UserMapper;
import com.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserController userController;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int addNew(User user) {
        return userMapper.addNew(user);
    }
}
