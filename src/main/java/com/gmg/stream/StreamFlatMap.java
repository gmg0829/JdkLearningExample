package com.gmg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author gmg
 * @title: StreamFlatMap
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/3/28 17:24
 */
public class StreamFlatMap {
    public static void main(String[] args) {
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.
                flatMap((childList) -> childList.stream());
        System.out.println(outputStream);
    }
}
