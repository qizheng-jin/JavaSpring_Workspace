package com.myweb.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myweb.config.SpringConfig;
import com.myweb.controller.EmpController;

public class TestAnnotation {

    @Test
    public void testAnno(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmpController controller = (EmpController) context.getBean("empController");
        controller.addEmp();
    }
}
