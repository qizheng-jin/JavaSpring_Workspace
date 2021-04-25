package com.myweb.controller;

import com.myweb.pojo.Student;
import com.myweb.service.StudentService;

public class StudentController {
    private StudentService studentService;
    private Student student;

    public void addStudent(){
        studentService.addStudent(student);
        System.out.println("success");
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
