package com.mhqf.cglib;

import com.mhqf.controller.MyAspect;
import com.mhqf.dao.GoodsDao;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author mhqf
 * @version 1.0
 * @date 2021/5/29 0:17
 */
public class MyBeanFactory {
    public static GoodsDao getBean() {
        //准备目标类
        final GoodsDao goodsDao = new GoodsDao();
        //创建切面类实例
        final MyAspect myAspect = new MyAspect();
        //生成代理类，CGLIB 在运行时，生成指定对象的子类，增强
        Enhancer enhancer = new Enhancer();
        //确定需要增强的类
        enhancer.setSuperclass(goodsDao.getClass());
        //添加回调函数
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.myBefore();//前增强
                Object obj = method.invoke(goodsDao, objects);//目标方法执行
                myAspect.myBefore();//后增强
                return obj;
            }
        });
//        创建代理类
        GoodsDao goodsDaoParoxy = (GoodsDao) enhancer.create();
        return goodsDaoParoxy;
    }
}
