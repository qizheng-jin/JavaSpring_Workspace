package com.myweb.service;

import com.myweb.dao.UserDao;
import com.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.selectAll();
    }

    @Override
    public int addNew(User user) {
       return userDao.insertNew(user);
    }

    @Override
    public int updateName(int id, String name) {
        return userDao.updateName(id, name);
    }


}
