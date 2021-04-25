package com.myweb.test;

import com.myweb.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void testSpring01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        通过ID查找User对象
        User user = (User) context.getBean("user");
//        通过反射建立User对象
        User user2 = context.getBean(User.class);
//        XML标签中添加scope属性,可以选择创建多例对象
        User user3 = (User) context.getBean("user");
        User user4 = (User) context.getBean("user");
        User user5 = (User) context.getBean("user");
        user.say();
        System.out.println(user.getName());
    }

    @Test
    public void demo2() throws Exception {
        Class userClass = Class.forName("com.myweb.pojo.User");
        User user = (User) userClass.newInstance();
        user.say();
    }

    @Test
    public void testLife(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = context.getBean(User.class);
//        调用方法
        user.say();
//        关闭容器则对象销毁
        context.close();
    }
}
