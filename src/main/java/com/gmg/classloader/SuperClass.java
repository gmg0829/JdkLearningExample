package com.gmg.classloader;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/10/24  9:58
 */
public class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}
