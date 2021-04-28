package com.myweb.controller;

import com.myweb.pojo.Emp;
import com.myweb.proxy.JDKProxy;
import com.myweb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Proxy;


@Controller
public class EmpController {
    @Autowired
    private Emp emp;
    @Autowired
    private EmpService empService;

    public void addEmp(){
          EmpService proxy =(EmpService)JDKProxy.createProxy(empService);
          proxy.addEmp(emp);
    }
}