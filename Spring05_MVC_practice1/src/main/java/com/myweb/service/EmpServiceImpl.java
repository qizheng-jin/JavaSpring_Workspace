package com.myweb.service;

import com.myweb.dao.EmpDao;
import com.myweb.pojo.Emp;

import java.util.List;

public class EmpServiceImpl implements EmpService{
    EmpDao empDao;
    @Override
    public void addEmp(Emp e) {
        empDao.addEmp(e);
    }

    @Override
    public List<Emp> selectAll() {
        return empDao.selectAll();
    }

    public EmpDao getEmpDao() {
        return empDao;
    }

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }
}
