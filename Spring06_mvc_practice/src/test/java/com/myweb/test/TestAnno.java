package com.myweb.test;

import com.myweb.config.SpringConfig;
import com.myweb.controller.EmpController;
import com.myweb.pojo.Emp;
import com.myweb.proxy.JDKProxy;
import com.myweb.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnno {
    @Test
    public void annotationTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmpController controller = context.getBean(EmpController.class);

        controller.addEmp();
    }
}
