package com.myweb.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@TableName("demo_user")
public class User implements Serializable { //实现序列化接口
    @TableId(type = IdType.AUTO) //主键自增
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
