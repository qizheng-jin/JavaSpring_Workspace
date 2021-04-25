package com.myweb.dao;

import com.myweb.pojo.User;
import org.springframework.stereotype.Repository;

//持久层
@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(User user) {
        System.out.println("用户入库： " + user);
    }
}
