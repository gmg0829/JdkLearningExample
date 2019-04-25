package com.gmg.generics;

import java.util.List;

/**
 * @author gmg
 * @title: Demo
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/25 13:48
 */
public interface Demo {
    public void write(Integer i, Integer[] ia);
    public void write(Double  d, Double[] da);
    public <T> void write(T t,T[] ta);
    public  void printList(List<?> list);
    //List<? extends E>不能使用add方法
    // Number的子类
    public void  dos(List<? extends Number> list);
    //Integer 父类
    public  void addNumbers(List<? super Integer> list);


}
