package com.myweb.dao;

import com.myweb.pojo.Emp;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmpDao {
    @Update("insert into emp value(#{id},#{name},#{job},#{salary});")
    int addEmp(Emp e);
    @Select("select * from emp")
    List<Emp> selectAll();
    @Select("select * from emp where id=#{id}")
    List<Emp> select(int id);
}
