package com.myweb.mapper;

import com.myweb.pojo.DemoUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public interface DemoUserMapper {
    @Select("select * from demo_user")
    public List<DemoUser> findAll();


    public int insertUser(DemoUser demoUser);

    public int updateUser(Map map);
}
