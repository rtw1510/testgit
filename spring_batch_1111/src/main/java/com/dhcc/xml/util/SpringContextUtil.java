package com.dhcc.xml.util;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
/**
* @Description: spring容器获取bean
* @Author: rtw
* @Date: 2020/12/29
*/
@Component
public class SpringContextUtil implements ApplicationContextAware{
    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringContextUtil.applicationContext == null) {
            SpringContextUtil.applicationContext = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    public static  Object getBean(Class clazz) {
        return getApplicationContext().getBean(clazz);
    }

    public static  Object getBean(String name, Class clazz) {
        return getApplicationContext().getBean(name, clazz);
    }
}
