package com.myweb;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.myweb.mapper.DemoUserMapper;
import com.myweb.pojo.DemoUser;


import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class NewTest {
    @Autowired
    private DemoUserMapper mapper;

    @Test
    public void testInsert(){
        DemoUser user = new DemoUser();
        user.setName("axx").setSex("nv").setAge(19);
        int rows = mapper.insert(user);
        System.out.println("影响行数： " + rows);
    }
    @Test
    public void testSelect(){
        DemoUser user = mapper.selectById(21);
        System.out.println(user);
        DemoUser user2 = new DemoUser();
        user2.setName("白骨精").setSex("女");
        //
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<DemoUser>(user2);
        List<DemoUser> userList = mapper.selectList(queryWrapper);
        for(DemoUser u:userList){
            System.out.println(u);
        }
    }

    @Test
    public void testSelect2(){
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 18).eq("sex", "女");
        List<DemoUser> list = mapper.selectList(queryWrapper);
        System.out.println(list);
    }

    /**
     * 查询sex=男的数据,以id倒叙排列 oderByDesc
     */
    @Test
    public void testSelect3(){
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sex", "男").orderByDesc("id");
        List<DemoUser> userList = mapper.selectList(queryWrapper);
        System.out.println(userList);
    }

    @Test
    public void testSelect5(){
//        数组使用包装类型
        Integer[] ids = {1, 3, 5, 6, 7};
//        将数组转化为集合
        List list=Arrays.asList(ids);
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", ids);
        List<DemoUser> demoUsers = mapper.selectList(queryWrapper);
        System.out.println(demoUsers);
    }

    /**
     * 如果根据姓名和性别属性查询数据, 有时候某个属性可能为null,
     * 要求动态查询!!!!!!!
     * where name = xxx age>xxx
     *
     * condition: 内部编辑一个判断条件, 如果返回值是true, 则拼接该字段
     */
    @Test
    public void testSelect6(){
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
        String name = null;
        int age = 18;
        queryWrapper.eq(name!=null, "name", "").gt(age>0,"age", 100);
        queryWrapper.eq(age>0, "age", age);
        List<DemoUser> list = mapper.selectList(queryWrapper);
        System.out.println(list);
    }

    @Test
    public void testSelect7(){
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
//        selectObjs查询第一列值
        List objs = mapper.selectObjs(null);
        System.out.println(objs);
    }

    @Test
    public void testSelect8(){
        QueryWrapper<DemoUser> queryWrapper = new QueryWrapper<>();
//        只选择name和sex两列数据
        queryWrapper.select("name", "age", "sex");
        queryWrapper.gt("age", 18);
//        selectMap"只输出选择的列
        List<Map<String,Object>> list = mapper.selectMaps(queryWrapper);
        System.out.println(list);
    }

    @Test
    public void testUpdate(){
        QueryWrapper wrapper = new QueryWrapper();
//        mapper.update(entity, queryWrapper) -->entity修改的数据进行封装
//                                              -->QueryWrapper条件构造器
        DemoUser demoUser = new DemoUser();
        demoUser.setName("爷").setSex("男");
        wrapper.eq("name", "中午吃什么");
        mapper.update(demoUser, wrapper);
    }
}
