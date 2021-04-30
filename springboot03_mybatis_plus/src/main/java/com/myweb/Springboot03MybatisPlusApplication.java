package com.myweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.myweb.mapper")
public class Springboot03MybatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot03MybatisPlusApplication.class, args);
	}

}
