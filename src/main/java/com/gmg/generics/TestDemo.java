package com.gmg.generics;

/**
 * @author gmg
 * @title: TestDemo
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/25 13:53
 */
public class TestDemo {
    public static <T extends Comparable<T>> T max(T x, T y, T z){
        T max = x;
        // 对象的比较用compareTo()方法,而不是大于小于号
        if ( y.compareTo( max ) > 0 ){
            max = y;
        }
        if ( z.compareTo( max ) > 0 ){
            max = z;
        }
        return max;
    }
    public static void main( String args[] ){
        System.out.println(max(3, 4, 5));
        System.out.println(max( 6.6, 8.8, 7.7 ) );
        System.out.println(max( "你", "我", "他" ) );
    }
}
