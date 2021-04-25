package com.myweb.pojo;

import java.util.Calendar;

public class StaticCalendar {

//    静态工厂没有必要实例化工厂对象
    public static Calendar getCalendar(){
        return Calendar.getInstance();
    }
}
