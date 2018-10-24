package com.gmg.classloader;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/10/24  9:59
 */
public class SubClass  extends SuperClass{
    static {
        System.out.println("SubClass init!");
    }
}
