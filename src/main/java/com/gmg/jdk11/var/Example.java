package com.gmg.jdk11.var;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        var list= List.of("hello","gmg");
        list.forEach(System.out::println);
    }
}
