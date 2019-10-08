package com.gmg.lamdba;

import java.util.function.Supplier;

/**
 * @author gmg
 * @title: TestJ8Supplier
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 15:36
 */
public class TestJ8Supplier {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());
    }
}
