package com.myweb.pojo;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private List<String> courseList;

    public Student() {
    }

    public Student(int id, String name, int age, List<String> courseList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courseList = courseList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", courseList=" + courseList +
                '}';
    }
}
