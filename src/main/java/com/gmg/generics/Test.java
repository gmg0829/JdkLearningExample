package com.gmg.generics;

/**
 * @author gmg
 * @title: Test
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/25 13:52
 */
public class Test {
    // 在这里<T>只是一个泛型标记的声明
    public static <T> void printArray(T[] Array){
        for (T element : Array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main( String args[] ){
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "整型数组元素为:" );
        printArray( intArray  );

        System.out.println( "双精度型数组元素为:" );
        printArray( doubleArray );

        System.out.println( "字符型数组元素为:" );
        printArray( charArray );
    }

}
