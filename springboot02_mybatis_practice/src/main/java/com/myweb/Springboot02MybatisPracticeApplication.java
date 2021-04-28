package com.myweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.myweb.dao")
public class Springboot02MybatisPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02MybatisPracticeApplication.class, args);
	}

}
