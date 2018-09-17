package com.gmg.singleton;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 懒汉式
 * @date 2018/9/17  15:30
 */
public class SingletonTwo {
    private static SingletonTwo ourInstance =null;

    public static synchronized SingletonTwo getInstance() {
        if (ourInstance == null) {
            ourInstance=new SingletonTwo();
        }
        return ourInstance;
    }

    private SingletonTwo() {
    }
}
