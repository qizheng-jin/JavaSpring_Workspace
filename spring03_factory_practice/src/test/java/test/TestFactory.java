package test;

import com.myweb.pojo.StaticCalendar;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class TestFactory {

    @Test
    public void testStaticFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        StaticCalendar staticCalendar= (StaticCalendar) context.getBean("staticFactory");
        staticCalendar.getCalendar();
    }

    @Test
    public void testInstanceFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Calendar calendar = (Calendar) context.getBean("instanceCalendar");
        calendar.getTime();
    }

    @Test
    public void testSpringFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Calendar calendar = (Calendar) context.getBean("SpringFactory");

    }


}
