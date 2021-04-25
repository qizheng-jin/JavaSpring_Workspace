package test;

import com.myweb.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testMVC(){
        ApplicationContext context = new AnnotationConfigApplicationContext("application_abandoned.xml");
        UserController userController=(UserController) context.getBean("userController");
        userController.addUser();
    }

    @org.junit.Test
    public void testUserController(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application_abandoned.xml");
        UserController userController = (UserController) context.getBean("userController");
        userController.addUser();
    }
}
