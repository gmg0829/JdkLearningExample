package com.gmg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStream {
public static void main(String[] args) {
	List<String> list=Arrays.asList("a1", "a2", "c3", "c6", "c4");
	//list.stream().filter(str->str.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
	List<String> list1=Arrays.asList("a1", "a2", "c3", "c6", "c4");
	List<String> list2=Arrays.asList("b1", "b2", "b3", "d6", "d4");
    List result=Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    long i=result.stream().count();
    //System.out.println(i);
    //result.stream().forEach(System.out::println);
    List<String> lists=Arrays.asList("a","b","c","a","ab","c");
    List result1=lists.stream().distinct().collect(Collectors.toList());
    result1.stream().forEach(System.out::println);
    List result2=lists.stream().map(str->str.replace("c", "*")).collect(Collectors.toList());
    result2.forEach(System.out::println);
    
    
}
}
