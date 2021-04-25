package com.myweb.service;

import com.myweb.dao.StudentDao;
import com.myweb.pojo.Student;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
