package com.gmg.design.strategy;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/18  17:33
 */
public class Calculator {
    private Strategy strategy;

    public int getResult(int a,int b) {
        return this.strategy.calculate(a,b);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
