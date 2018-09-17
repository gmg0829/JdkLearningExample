package com.gmg.factory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/17  15:47
 */
public class Bus implements Traffic {
    @Override
    public void gotwork() {
        System.out.println("坐着公交去上班");
    }
}
