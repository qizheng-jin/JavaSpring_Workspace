package test;

import com.myweb.controller.EmpController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        EmpController controller = context.getBean(EmpController.class);
        controller.addEmp();
    }

    @Test
    public void testSelectAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        EmpController controller = (EmpController) context.getBean(EmpController.class);
        controller.selectAll();
    }
}
