package com.myweb;

import com.myweb.mapper.DemoUserMapper;
import com.myweb.pojo.DemoUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class Springboot03MybatisPlusApplicationTests {
	@Autowired
	private DemoUserMapper mapper;
	@Test
	void contextLoads() {
		DemoUser user = new DemoUser();
		user.setName("axx").setSex("nv").setAge(19);
		int rows = mapper.insert(user);
		System.out.println("影响行数： " + rows);
	}




}
