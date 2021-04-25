package Test;

import com.myweb.controller.StudentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        StudentController controller = (StudentController) context.getBean("studentController");
        controller.addStudent();
    }
}
