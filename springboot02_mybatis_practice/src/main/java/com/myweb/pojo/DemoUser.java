package com.myweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
public class DemoUser {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
