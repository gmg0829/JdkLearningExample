package com.gmg.obs;

/**
 * @author gmg
 * @Title:
 * @Package   观察者模式
 * @Description: 定义对象间一种一对多的依赖关系，使得当每一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。
 * @date 2018/9/17  17:24
 */
public class Client
{
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        subject.addObserver(new ConcreteObserver1());
        subject.addObserver(new ConcreteObserver2());
        subject.doSomething();
    }

}
