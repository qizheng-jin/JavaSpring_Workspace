package com.myweb.service;

import com.myweb.dao.UserDao;
import com.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("target")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(User user) {
//        try {
//            把事务控制写在这里耦合度过高,代码冗余,所以应该用代理模式进行编辑
//            System.out.println("事务开始");
            userDao.addUser(user);
//            System.out.println("事务结束");
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("事务回滚");
//        }
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
}
