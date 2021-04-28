package com.myweb;

import com.myweb.config.SpringConfig;
import com.myweb.controller.EmpController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {

    @Test
    public void aopTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmpController controller = context.getBean(EmpController.class);
        controller.addEmp();
    }
}
