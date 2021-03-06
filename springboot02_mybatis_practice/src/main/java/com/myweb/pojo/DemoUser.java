package com.myweb.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors
//如果没有添加注解属性值 ，则默认类名当作表名
@TableName("demo_user")
@AllArgsConstructor
@NoArgsConstructor
public class DemoUser {
    //TableId是主键注解， type里面是主键的特点（自增、不自增）
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
