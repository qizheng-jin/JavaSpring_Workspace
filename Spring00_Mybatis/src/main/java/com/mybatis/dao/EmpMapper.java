package com.mybatis.dao;

import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface EmpMapper {

    @Select("select * from emp")
    List<Emp> selectAll();

    @Update("update emp set salary=#{sal} where name=#{name}")
    int updateSal(Map map);
}
