package com.myweb.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)  //几乎不用构造方法赋值
public class User {
    //和页面的name属性必须一一对应, POJO中实体对象中"必须"使用包装类型
   //规则说明: 1. 基本类型有默认值  包装类型默认值为null
//           2. 基本类型中没有多余的方法, 后续代码取值有问题
    private Integer id;
    private String name;
    private String[] hobbys;
    private Dog dog; //通过对象的引用完成赋值
}
