package com.myweb.dao;

import com.myweb.pojo.DemoUser;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface DemoUserDao {
    @Select("select * from demo_user")
    public List<DemoUser> selectAll();
    @Update("insert into demo_user value(#{id}, #{name}, #{age}, #{sex})")
    public int addNew(DemoUser demoUser);
    @Update("update demo_user set name=#{name} where id=#{id}")
    public int updateName(int id, String name);
    @Update("delete from demo_user where id=#{id}")
    public int deleteOne(Map map);
}
