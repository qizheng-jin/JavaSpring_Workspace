package com.myweb;

import com.myweb.mapper.DemoUserMapper;
import com.myweb.pojo.DemoUser;
import com.myweb.pojo.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;

@SpringBootTest //在执行测试方法时,自动启动Spring容器
class Springboot01RebuildApplicationTests {

	@Autowired
	private Dept dept;
	@Autowired
	private DemoUserMapper demoUserMapper;

	@Test
	void contextLoads() {
		List<DemoUser> list =   demoUserMapper.findAll();
		for(DemoUser d: list){
			System.out.println(d);
		}


	}
	@Test
	void insertUser(){
		DemoUser demoUser = new DemoUser();
		demoUser.setId(1111);
		demoUser.setName("人");
		demoUser.setAge(100);
		demoUser.setSex("male");
		int rows = demoUserMapper.insertUser(demoUser);
		System.out.println("受影响行数" + rows);
	}

	@Test
	void updateUser(){
		Map map = new HashMap();
		map.put("id", 1111);
		map.put("name", "野人");
		int rows = demoUserMapper.updateUser(map);
		System.out.println("受影响行数: " + rows);
	}
}
