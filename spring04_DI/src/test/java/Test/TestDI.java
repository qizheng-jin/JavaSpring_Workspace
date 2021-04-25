package Test;

import com.myweb.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = (User)context.getBean("user");
        User user2 = (User)context.getBean("user_constr");
        System.out.println(user);
        System.out.println(user2);
    }
}
