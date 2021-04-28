package com.myweb;

import com.myweb.config.SpringConfig;
import com.myweb.pojo.User;
import com.myweb.proxy.JDKProxyFactory;
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

    @Test
    public void testStaticProxy(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = new User();
        user.setId(2);
        user.setName("你的林皇");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser(user);
    }

    @Test
    public void testJDKProxy(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//      获取目标对象
        UserService target = (UserService) context.getBean("target");
//        获取代理对象
        UserService userService = (UserService) JDKProxyFactory.getProxy(target);
//        用户完成调用方法
        User user = new User();
        user.setId(3);
        user.setName("卡噜噜");
        userService.addUser(user);
        userService.deleteUser(user);
    }
}
