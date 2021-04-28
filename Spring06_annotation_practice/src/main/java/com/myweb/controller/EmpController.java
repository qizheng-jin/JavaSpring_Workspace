package com.myweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.myweb.pojo.Emp;
import com.myweb.service.EmpService;

@Controller
public class EmpController {
    @Autowired
    private Emp emp;
    @Autowired
    private EmpService empService;

    public void addEmp(){
        empService.addEmp(emp);
    }
}
