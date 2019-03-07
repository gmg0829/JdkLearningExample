package com.gmg.reflect;

import java.lang.reflect.Method;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/3/7  11:20
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class<?> c = MethodClass.class;
        Object object = c.newInstance();
        Method[] methods = c.getMethods();
        Method[] declaredMethods = c.getDeclaredMethods();
        //获取methodClass类的add方法
        Method method = c.getMethod("add", int.class, int.class);
        method.invoke(object,1,2);
        //getMethods()方法获取的所有方法
        System.out.println("getMethods获取的方法：");
        for(Method m:methods)
            System.out.println(m);
        System.out.println("getDeclaredMethods获取的方法：");
        for(Method m:declaredMethods)
            System.out.println(m);

    }
}
class MethodClass {
    public final int fuck = 3;
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a+b;
    }
}