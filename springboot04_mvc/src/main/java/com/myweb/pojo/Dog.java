package com.myweb.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Dog {
    private Integer id;
    private String name;
}
