package com.myweb.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//为属性赋值的方式
public class User {
    private Integer id;
    private String name;
    private List list;
    private Set set;
    private Map map;
    private Properties properties;

    public User() {
    }



    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List getList() {
        return list;
    }

    public Set getSet() {
        return set;
    }

    public Map getMap() {
        return map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
