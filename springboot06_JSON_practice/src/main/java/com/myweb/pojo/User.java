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
public class User implements Serializable {
    @TableId(type = IdType.AUTO)
    private int id;
    private String name;
    private int age;
    private String sex;
}
