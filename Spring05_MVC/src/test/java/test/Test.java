package test;

import com.myweb.controller.UserController;
import com.myweb.dao.UserDaoImpl;
import com.myweb.pojo.User;
import com.myweb.service.UserService;
import com.myweb.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testMVC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserController userController=(UserController) context.getBean("userController");
        userController.addUser();
    }
}
