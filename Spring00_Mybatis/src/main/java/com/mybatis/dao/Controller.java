package com.mybatis.dao;

import com.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {
    SqlSession session;

    public Controller() throws IOException{
        InputStream in = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
    }

    @Before
    public void beforeMethod() throws IOException {
        InputStream in = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
    }

    @Test
    public void select(){
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> list = mapper.selectAll();
        for(Emp e: list){
            System.out.println(e);
        }
    }

    @Test
    public void update(){
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Map map = new HashMap();
        map.put("name", "王海涛");
        map.put("sal", 1000);
        mapper.updateSal(map);
        session.commit();
    }

    public static void main(String[] args) {
        try {
            Controller controller = new Controller();
            controller.select();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
