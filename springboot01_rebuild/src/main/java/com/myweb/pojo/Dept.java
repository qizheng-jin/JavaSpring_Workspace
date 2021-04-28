package com.myweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:/dept.properties", encoding = "UTF-8")
@Data //lamlok包的导入， 将这个数据类型交给lamlok自动生成get/set/toString方法等
@Accessors(chain = true) //重写set方法, 返回this对象
@NoArgsConstructor //lamlok创建无参构造
@AllArgsConstructor //lamlok全参构造
public class Dept {
    @Value("${dept.id}")
    private Integer id;
    @Value("${dept.name}")
    private String name;

    @Value("${dept.id2}")
    private Integer id2;
    @Value("${dept.name2}")
    private String name2;

}
