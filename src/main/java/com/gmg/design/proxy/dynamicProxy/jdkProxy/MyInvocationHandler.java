package com.gmg.design.proxy.dynamicProxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/5  11:05
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理对象
    private Object target;
    public MyInvocationHandler(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("准备向数据库中插入数据");
        Object returnValue=method.invoke(target,args);
        System.out.println("插入数据库成功");
        return returnValue;
    }
}
