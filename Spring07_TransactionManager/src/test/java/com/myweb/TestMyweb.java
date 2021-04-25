package com.myweb;

import com.myweb.config.SpringConfig;
import com.myweb.pojo.User;
import com.myweb.service.UserService;
import com.myweb.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMyweb {

    @Test
    public void testUser(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        面向接口编程的思想,写接口Spring会自动找实现类
        UserService userService=context.getBean(UserService.class);
        User user = new User();
        user.setId(1);
        user.setName("吃!!");
        userService.addUser(user);
    }
}
