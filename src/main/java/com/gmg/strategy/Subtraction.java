package com.gmg.strategy;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/18  17:33
 */
public class Subtraction implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
