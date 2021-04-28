package com.myweb.dao;

import org.springframework.stereotype.Repository;

import com.myweb.pojo.Emp;

@Repository
public class EmpDaoImpl implements EmpDao{

    @Override
    public void addEmp(Emp emp) {
        System.out.println("新增员工: " + emp);
    }
}
