package com.myweb.dao;

import com.myweb.pojo.Emp;
import org.springframework.stereotype.Repository;


public interface EmpDao {
    void addEmp(Emp emp);
}
