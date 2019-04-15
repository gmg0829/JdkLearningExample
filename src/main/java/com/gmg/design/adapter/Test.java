package com.gmg.design.adapter;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 适配器模式 已经存在的类的接口不符合我们的需求；
 * @date 2018/9/27  15:13
 */
public class Test {
    public static void main(String[] args) {
        //使用特殊功能类，即适配类
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
