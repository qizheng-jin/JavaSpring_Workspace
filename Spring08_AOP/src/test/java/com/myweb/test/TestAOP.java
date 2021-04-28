package com.myweb.test;

import com.myweb.config.SpringConfig;
import com.myweb.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {

    @Test
    public void aopTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        加入AOP之后deptService得到的是代理对象
        DeptService deptService = context.getBean(DeptService.class);
        deptService.addDept();
        deptService.updateDept();
    }

    @Test
    public void aopTest2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        加入AOP之后deptService得到的是代理对象
        DeptService deptService = context.getBean(DeptService.class);
        deptService.doAround();
    }


}
