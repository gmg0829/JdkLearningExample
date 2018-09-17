package com.gmg.decorator;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/17  13:34
 */
public class FoundationMakeup extends Decorator{

    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.println("打粉底(");
        showable.show();
        System.out.println(")");
    }
}
