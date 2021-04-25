package com.test;

import com.myweb.config.SpringConfig;
import com.myweb.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

public class TestMVC {

//    @Test
//    public void testMVC(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        UserController userController = (UserController) context.getBean(UserController.class);
//        userController.addUser();
//    }

    @Test
    public void testAnno(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController controller = (UserController) context.getBean(UserController.class);
        controller.addUser();
    }
}
