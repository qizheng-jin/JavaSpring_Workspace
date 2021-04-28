package com.myweb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.myweb.pojo.Emp;

@Configuration
@ComponentScan("com.myweb")
@PropertySource(value="classpath:/Emp.properties", encoding = "UTF-8")
public class SpringConfig {
    @Value("${emp.id}")
    private int id;
    @Value("${emp.name}")
    private String name;
    @Value("${emp.job}")
    private String job;
    @Value("${emp.salary}")
    private double salary;

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
