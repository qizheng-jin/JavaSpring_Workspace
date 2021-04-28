package com.myweb.controller;

import com.myweb.pojo.Emp;
import com.myweb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmpController {
    @Autowired
    private EmpService service;
    @Autowired
    private Emp emp;

    public void addEmp(){
        service.addEmp(emp);
    }
}
