package com.gmg.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author gmg
 * @title: StreamConvert
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/3/28 17:25
 */
public class StreamConvert {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("a","b","c","a","ab","c");
        Stream<String> stream=lists.stream();
        // 1. Array
        String[] strArray1 = stream.toArray(String[]::new);
       // 2. Collection
        List<String> list1 = stream.collect(Collectors.toList());
        List<String> list2 = stream.collect(Collectors.toCollection(ArrayList::new));
        Set set1 = stream.collect(Collectors.toSet());
        Stack stack1 = stream.collect(Collectors.toCollection(Stack::new));
       // 3. String
        String str = stream.collect(Collectors.joining()).toString();
    }
}
