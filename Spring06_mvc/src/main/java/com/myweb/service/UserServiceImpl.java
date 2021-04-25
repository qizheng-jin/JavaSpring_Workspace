package com.myweb.service;

import com.myweb.dao.UserDao;
import com.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired //根据类型进行注入, 如果类型不能匹配,则根据属性名称进行注入
    @Qualifier("userDaoImpl") //如果加了Qualifier, 就必须按照名称(实现类的名字,不是接口的名字, 首字母小写)进行匹配, 如果没有匹配项, 则会报错
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
