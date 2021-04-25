package com.myweb.pojo;

public class User {
    String name;
    public User(){
        System.out.println("创建对象");
    }
    /**
     *  初始化
     */
    public void init(){
        this.name = "名字";
        System.out.println(this.name);
    }

    /**
     *  销毁
     */
    public void destroy(){
        this.name=null;
        System.out.println("释放资源: " + this.name);
    }

    public void say(){
        System.out.println("您好Spring框架");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
