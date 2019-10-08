package com.gmg.lamdba;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author gmg
 * @title: TestJ8Predicate
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 15:28
 */
public class TestJ8Predicate {
    public static void main(String[] args) {
        TestJ8Predicate testJ8Predicate = new TestJ8Predicate();
        testJ8Predicate.printBigValue(10, val -> val > 5);
        testJ8Predicate.printBigValueAnd(10, val -> val > 5);
        testJ8Predicate.printBigValueAnd(6, val -> val > 5);
        //binary predicate
        BiPredicate<Integer, Long> biPredicate = (x, y) -> x > 9 && y < 100;
        System.out.println(biPredicate.test(100, 50L));
    }
    public void printBigValue(int value, Predicate<Integer> predicate) {
        if (predicate.test(value)) {
            System.out.println(value);
        }
    }
    public void printBigValueAnd(int value, Predicate<Integer> predicate) {
        if (predicate.and(v -> v < 8).test(value)) {
            System.out.println("value < 8 : " + value);
        } else {
            System.out.println("value should < 8 at least.");
        }
    }
}