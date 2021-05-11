package com.myweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myweb.pojo.UserAccount;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserAccountMapper extends BaseMapper<UserAccount> {

    @Select("select * from my_login where username=#{username}")
    List<UserAccount> login(String username);
}
