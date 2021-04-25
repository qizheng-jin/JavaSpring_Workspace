package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class TestSpring {

    @Test
    public void testStatic(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Calendar calendar = (Calendar) context.getBean("calendar1");
        System.out.println(calendar.getTime());
    }

    @Test
    public void testInstance(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Calendar calendar =(Calendar) context.getBean("calendar2");
        System.out.println(calendar.getTime());
    }
    @Test
    public void testSpringFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Calendar calendar =(Calendar) context.getBean("calendar3");
        System.out.println(calendar.getTime());
    }
}
