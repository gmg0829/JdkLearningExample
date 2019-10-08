package com.gmg.lamdba;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author gmg
 * @title: OperatorDemo
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 15:25
 */
public class OperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> add = x -> x + 1;
        System.out.println(add.apply(1));
        BinaryOperator<Integer> addxy = (x, y) -> x + y;
        System.out.println(addxy.apply(3, 5));

        BinaryOperator<Integer> min = BinaryOperator.minBy((o1, o2) -> o1 - o2);
        System.out.println(min.apply(100, 200));
        BinaryOperator<Integer> max = BinaryOperator.maxBy((o1, o2) -> o1 - o2);
        System.out.println(max.apply(100, 200));
    }
}
