package com.myweb.controller;

import com.myweb.pojo.Emp;
import com.myweb.service.EmpService;

import java.util.List;

public class EmpController {
    private EmpService empService;
    private Emp emp;

    public void addEmp(){
        empService.addEmp(emp);
    }

    public List<Emp> selectAll(){
        return empService.selectAll();
    }

    public EmpService getEmpService() {
        return empService;
    }

    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
}
