package com.myweb.service;

import com.myweb.dao.UserDao;
import com.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 关于@Autowired注解的说明;
 * 1. @Autowired: 可以根据类型/属性名称进行注入 首先按照类型进行注入
 * 2. @Qualifier: 如果需要按照名称进行注入, 则需要额外添加@Qualifier
 * @Resource = @Autowired + @Qualifier 但@Resource是java原生的和Autowired和Qualifier有时候会冲突,
 * 所以一般情况用@Autowired
 * 上述注解在注入调用时候 自动封装了set方法
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService{
    @Autowired
    @Qualifier(value = "属性名")
//    @Resource(type = "")
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
