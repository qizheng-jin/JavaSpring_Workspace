package com.myweb.config;

import com.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  //标识一个配置类, 相当于application.xml
                //设定包扫描的路径
/*
 * @ComponentScan注解：让Spring进行扫描，默认只扫描此类所在的包及其子包
 * @ComponentScan("com.tedu.*")：也可以指定所扫描的包(com.tedu包及其子包)
 * @ComponentScan(basePackages = {"com.tedu.dao","com.tedu.service"})：
 *  当需要扫描的包有多个时，可以指定多个包。
 */
@ComponentScan("com.myweb") //如果注解中只有value属性 则可以省略
@PropertySource(value = "classpath:/user.properties", encoding = "UTF-8") //看到source就写classpath classpath:/是resources文件夹的所在目录
public class SpringConfig {
    @Value("${user.id}") //${}Spring-el表达式可以在Spring容器中查找key=user.id的数据
    private Integer id;
    @Value("${user.userName}")
    private String userName;
    /**
     *
     * Spring <bean id=
     */
    @Bean
    public User user(){
        User user = new User();
        user.setId(id);
        user.setUsername(userName);
        return user;
    }

}
