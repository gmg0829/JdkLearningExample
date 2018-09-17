package com.gmg.decorator;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/17  13:34
 */
public class Lipstick extends Decorator{

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.println("涂口红(");
        showable.show();
        System.out.println(")");
    }
}
