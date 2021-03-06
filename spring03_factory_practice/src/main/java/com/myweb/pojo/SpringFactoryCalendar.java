package com.myweb.pojo;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class SpringFactoryCalendar implements FactoryBean<Calendar> {

    @Override
    public Calendar getObject() throws Exception {
        return Calendar.getInstance();
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
