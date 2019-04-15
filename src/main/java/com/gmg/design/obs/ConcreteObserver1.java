package com.gmg.design.obs;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/17  17:23
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者1收到消息");
    }

}
