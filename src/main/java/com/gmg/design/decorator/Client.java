package com.gmg.design.decorator;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/17  13:37
 */
public class Client {
    public static void main(String[] args) {
        Showable showable=new Lipstick(new FoundationMakeup(new Girl()));
        showable.show();
    }
}
