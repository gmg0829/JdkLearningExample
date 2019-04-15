package com.gmg.design.singleton;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 双重锁设置
 * @date 2018/9/17  15:31
 */
public class SingletonThree {
    private static volatile SingletonThree singletonThree=null;

    private SingletonThree() {
    }

    public static SingletonThree getSingletonThree(){
        if (singletonThree==null){
            synchronized (SingletonThree.class){
                if (singletonThree == null) {
                    singletonThree=new SingletonThree();
                }
            }
        }
        return singletonThree;
    }
}
