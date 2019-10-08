package com.gmg.lamdba;

import java.util.function.Consumer;

/**
 * @author gmg
 * @title: TestJ8Consumer
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 15:35
 */
public class TestJ8Consumer {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(100);
    }
}
