package com.myweb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myweb.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao extends BaseMapper {
    @Update("update demo_user set name=#{name} where id=#{id}")
    int updateName(int id, String name);
    @Select("select * from demo_user")
    List<User> selectAll();
    @Insert("insert into demo_user value(#{id}, #{name}, #{age}, #{sex})")
    int insertNew(User user);
}
