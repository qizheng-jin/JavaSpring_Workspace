package com.myweb.dao;

import com.myweb.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class EmpDaoImpl implements EmpDao{
    SqlSession session;
    public EmpDaoImpl() throws IOException {
        InputStream in = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();

    }

    @Override
    public int addEmp(Emp e) {
        System.out.println("添加新职员: " + e);
        EmpDao empDao = session.getMapper(EmpDao.class);
        int rows = empDao.addEmp(e);
        System.out.println("影响行数： " + rows + "写入数据库： " + e);
        session.commit();
        return rows;
    }

    @Override
    public List<Emp> selectAll() {
        EmpDao empDao = session.getMapper(EmpDao.class);
        List<Emp> empList = empDao.selectAll();
        for(Emp e: empList){
            System.out.println(e);
        }
        return empList;
    }

    @Override
    public List<Emp> select(int id) {
        EmpDao empDao = session.getMapper(EmpDao.class);
        List<Emp> empList = empDao.select(id);
        for (Emp emp: empList){
            System.out.println(emp);
        }
        return empList;
    }
}
