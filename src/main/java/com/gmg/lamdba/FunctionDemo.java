package com.gmg.lamdba;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author gmg
 * @title: FunctionDemo
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 15:14
 *
 * https://www.cnblogs.com/hongdada/p/10021816.html
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> incr1 = x -> x + 1;
        Function<Integer, Integer> multiply = x -> x * 2;
        int x = 2;
        System.out.println("f(x)=x+1,when x=" + x + ", f(x)=" + incr1.apply(x));
        System.out.println("f(x)=x+1,g(x)=2x, when x=" + x + ", f(g(x))=" + incr1.compose(multiply).apply(x));
        System.out.println("f(x)=x+1,g(x)=2x, when x=" + x + ", g(f(x))=" + incr1.andThen(multiply).apply(x));
        System.out.println("compose vs andThen:f(g(x))=" + incr1.compose(multiply).apply(x) + "," + multiply.andThen(incr1).apply(x));

        //binary function
        BiFunction<Integer, Integer, Integer> multiplys = (a, b) -> a * b;
        System.out.println("f(z)=x*y, when x=3,y=5, then f(z)=" + multiplys.apply(3, 5));

    }

}
