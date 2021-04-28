package com.myweb.service;

import com.myweb.dao.EmpDao;
import com.myweb.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface EmpService {
    void addEmp(Emp emp);
}
