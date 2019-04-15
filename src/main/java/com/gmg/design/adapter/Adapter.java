package com.gmg.design.adapter;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 适配器角色
 * @date 2018/9/27  15:12
 */
public class Adapter  implements Target {
    private  Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
     this.adaptee.specificRequest();
    }
}
