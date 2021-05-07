package com.myweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myweb.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {
    @Select("select * from demo_user")
    public List<User> selectAll();

    @Insert("insert into demo_user value(#{id}, #{name}, #{age}, #{sex})")
    public int addNew(User user);
}
