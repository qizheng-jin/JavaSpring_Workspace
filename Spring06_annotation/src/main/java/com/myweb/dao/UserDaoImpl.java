package com.myweb.dao;

import com.myweb.pojo.User;
import org.springframework.stereotype.Repository;

/**用注解标识之后, 类就变成了一个bean <bean id="类名首字母小写" class="UserDaoImpl.class" />
 * 如果需要修改beanID则手动添加value属性
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(User user) {
        System.out.println("添加用户 " + user);
    }
}
