package com.myweb.dao;

import com.myweb.pojo.Student;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void addStudent(Student student) {
        System.out.println("创建新学生: " + student);
    }

}
