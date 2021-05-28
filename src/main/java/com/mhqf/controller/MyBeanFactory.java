package com.mhqf.controller;

import com.mhqf.dao.CustomerDao;
import com.mhqf.dao.impl.CustomerDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mhqf
 * @version 1.0
 * @date 2021/5/28 23:36
 */
public class MyBeanFactory {
    public static CustomerDao getBean(){
        //准备目标对象
        final CustomerDao customerDao = new CustomerDaoImpl();
        //创建切面类实例
        final MyAspect myAspect = new MyAspect();
        return (CustomerDao) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),new Class[]{ CustomerDao.class }, new InvocationHandler() {
            public Object invoke(Object proxy, Method method,
                                 Object[] args) throws Throwable {
                myAspect.myBefore(); // 前增强
                Object obj = method.invoke(customerDao, args);
                myAspect.myAfter(); // 后增强
                return obj;
            }
        });
    }
}
