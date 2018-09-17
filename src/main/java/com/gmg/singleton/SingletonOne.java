package com.gmg.singleton;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 饿汉式单例
 * @date 2018/9/17  15:27
 */
public class SingletonOne {
    /**
     * 1，私有的构造方法

     2，指向自己实例的私有静态引用

     3，以自己实例为返回值的静态的公有的方法
     */
    private static SingletonOne ourInstance = new SingletonOne();

    public static SingletonOne getInstance() {
        return ourInstance;
    }

    private SingletonOne() {
    }

    /** 优点
     * 1，在内存中只有一个对象，节省内存空间。

     2，避免频繁的创建销毁对象，可以提高性能。

     3，避免对共享资源的多重占用。

     4，可以全局访问。
     */
}
