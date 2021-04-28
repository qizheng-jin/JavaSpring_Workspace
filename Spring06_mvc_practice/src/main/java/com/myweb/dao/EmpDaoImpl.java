package com.myweb.dao;

import com.myweb.pojo.Emp;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao{
    @Override
    public void addEmp(Emp emp) {
        System.out.println("新增的员工: " + emp);
    }
}
