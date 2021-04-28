package com.myweb.service;

import com.myweb.config.SpringConfig;
import com.myweb.dao.EmpDao;
import com.myweb.pojo.Emp;
import com.myweb.proxy.JDKProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpDao empDao;
    @Override
    public void addEmp(Emp emp) {
        empDao.addEmp(emp);
    }
}
