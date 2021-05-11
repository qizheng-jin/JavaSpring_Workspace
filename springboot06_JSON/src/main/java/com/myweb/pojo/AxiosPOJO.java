package com.myweb.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AxiosPOJO {

    private Integer id;
    private String name;
}
