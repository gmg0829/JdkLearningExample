package com.gmg.design.obs;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/17  17:20
 */
public class ConcreteSubject extends Subject {
    @Override
    public void doSomething() {
        System.out.println("被观察者事件发生");
        this.notifyObserver();
    }
}
