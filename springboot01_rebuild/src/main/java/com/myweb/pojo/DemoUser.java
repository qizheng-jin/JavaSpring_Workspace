package com.myweb.pojo;

import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors
public class DemoUser {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
