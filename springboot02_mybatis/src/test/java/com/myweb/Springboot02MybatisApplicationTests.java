package com.myweb;

import com.myweb.mapper.DemoUserMapper;
import com.myweb.pojo.DemoUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot02MybatisApplicationTests {
	@Autowired
	private DemoUserMapper demoUserMapper;
	@Test
	void contextLoads() {
		List<DemoUser> list=demoUserMapper.selectAll();
		for(DemoUser demoUser: list){
			System.out.println(demoUser);
		}
	}

}
