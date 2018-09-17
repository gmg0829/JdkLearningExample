package com.gmg.factory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/17  15:47
 */
public class Bike implements Traffic {
    @Override
    public void gotwork() {
        System.out.println("骑着自行车去上班");
    }
}
