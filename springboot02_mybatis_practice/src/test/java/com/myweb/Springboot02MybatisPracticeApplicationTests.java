package com.myweb;

import com.myweb.dao.DemoUserDao;
import com.myweb.pojo.DemoUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Springboot02MybatisPracticeApplicationTests {
	@Autowired
	private DemoUserDao dao;

	@Test
	void contextLoads() {
	}

	@Test
	void testSelect(){
		List<DemoUser> list = dao.selectAll();
		for(DemoUser user: list){
			System.out.println(user);
		}
	}

	@Test
	void testAdd(){
		DemoUser demoUser = new DemoUser(4396, "clearlove", 30, "男");
		int rows = dao.addNew(demoUser);
		System.out.println("影响行数: " + rows);
	}
	@Test
	void testUpdate(){
		int rows =dao.updateName(1111, "查理斯");
		System.out.println("影响行数: " + rows);
	}
	@Test
	void testDelete(){
		Map map = new HashMap();
		map.put("id", 4396);
		int rows = dao.deleteOne(map);
		System.out.println("影响行数: " + rows);
	}

}
