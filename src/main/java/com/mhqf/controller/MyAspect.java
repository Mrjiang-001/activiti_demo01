package com.mhqf.controller;

/**
 * @author mhqf
 * @version 1.0
 * @date 2021/5/28 23:34
 */
public class MyAspect {
    public void myBefore() {
        System.out.println("方法执行之前");
    }

    public void myAfter() {
        System.out.println("方法执行之后");
    }
}
