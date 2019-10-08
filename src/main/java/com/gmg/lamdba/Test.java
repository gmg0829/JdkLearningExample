package com.gmg.lamdba;

/**
 * @author gmg
 * @title: Test
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 14:53
 */
public class Test{
    public static void main(String[] args) {
        GreetingService greetService = message -> System.out.println("Hello " + message);
        greetService.sayMessage("host");

        int sum = GreetingService.sum(new int[]{1,2,3,4,5});
    }
}
