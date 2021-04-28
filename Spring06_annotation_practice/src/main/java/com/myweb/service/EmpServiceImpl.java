package com.myweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.dao.EmpDao;
import com.myweb.pojo.Emp;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpDao empDao;
    @Override
    public void addEmp(Emp emp) {
        empDao.addEmp(emp);
    }
}
