package com.myweb.service;

import com.myweb.anno.MyAnno;
import com.myweb.dao.EmpDao;
import com.myweb.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpDao empDao;

    @Override
    @MyAnno
    public void addEmp(Emp emp) {
        empDao.addEmp(emp);
    }
}
