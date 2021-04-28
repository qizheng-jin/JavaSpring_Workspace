package com.myweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.myweb.mapper") //将mapper接口交给Spring管理
public class Springboot01RebuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot01RebuildApplication.class, args);
	}

}
