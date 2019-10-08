package com.gmg.lamdba;

import java.util.Arrays;

/**
 * @author gmg
 * @title: GreetingService
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 14:50
 */
@FunctionalInterface
public interface GreetingService {

    static int sum(int[] array) {
        return Arrays.stream(array).reduce((a, b) -> a+b).getAsInt();
    }
    void sayMessage(String message);
}
