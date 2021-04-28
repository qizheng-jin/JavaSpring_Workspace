package com.myweb.config;

import com.myweb.pojo.Emp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.myweb")
@PropertySource(value = "Emp.properties", encoding = "UTF-8")
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class SpringConfig {
    @Value("${emp.id}")
    private Integer id;
    @Value("${emp.name}")
    private String name;
    @Value("${emp.job}")
    private String job;
    @Value("${emp.salary}")
    private Double salary;

    @Bean
    public Emp emp(){
        Emp emp = new Emp();
        emp.setId(id);
        emp.setName(name);
        emp.setJob(job);
        emp.setSalary(salary);
        return emp;
    }
}
