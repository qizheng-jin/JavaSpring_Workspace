package com.myweb.service;

import com.myweb.pojo.Emp;

import java.util.List;

public interface EmpService {
    void addEmp(Emp e);
    List<Emp> selectAll();
}
