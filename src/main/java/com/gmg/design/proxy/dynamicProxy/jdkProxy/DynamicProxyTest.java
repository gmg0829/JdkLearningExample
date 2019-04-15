package com.gmg.design.proxy.dynamicProxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/5  11:09
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
       // 实际上，动态代理的代理对象是在内存中的，是JDK根据我们传入的参数生成好的。
        IUserService target=new UserServiceImpl();
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler(target);
        //第一个参数是指定代理类的类加载器（我们传入当前测试类的类加载器）
        //第二个参数是代理类需要实现的接口（我们传入被代理类实现的接口，这样生成的代理类和被代理类就实现了相同的接口）
        //第三个参数是invocation handler，用来处理方法的调用。这里传入我们自己实现的handler
        IUserService iUserService=(IUserService) Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(),target.getClass().getInterfaces(),myInvocationHandler);
        iUserService.add("hello dynamic");
    }
}
