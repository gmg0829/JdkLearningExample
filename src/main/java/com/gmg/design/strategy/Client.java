package com.gmg.design.strategy;

/**
 * @author gmg
 * @Title:
 * @Package  拓展性
 * @Description: 策略模式
 * @date 2018/9/18  17:34
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.setStrategy(new Addition());
        int result1=calculator.getResult(1,2);
        System.out.println(result1);

        calculator.setStrategy(new Subtraction());
        int result2=calculator.getResult(2,1);
        System.out.println(result2);
    }
}
