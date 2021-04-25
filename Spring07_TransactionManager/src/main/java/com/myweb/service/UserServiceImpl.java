package com.myweb.service;

import com.myweb.dao.UserDao;
import com.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
//    事物的控制应该放到service层中
    @Override
    public void addUser(User user) {
        try {
            System.out.println("事务开始");
            userDao.addUser(user);
            System.out.println("事务结束");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("事务回滚");
        }
    }
}
