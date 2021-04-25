package com.myweb.dao;

/**
 * Data Access Object -- 数据访问对象
 * 是一个面向对象的数据库接口
 */

import com.myweb.pojo.User;

public interface UserDao {
    void addUser(User user);
}
