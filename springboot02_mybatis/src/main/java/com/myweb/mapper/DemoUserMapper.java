package com.myweb.mapper;

import com.myweb.pojo.DemoUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DemoUserMapper {
    @Select("select * from demo_user")
    List<DemoUser> selectAll();
}
