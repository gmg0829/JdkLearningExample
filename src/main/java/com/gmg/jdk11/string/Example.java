package com.gmg.jdk11.string;

public class Example {
    public static void main(String[] args) {
        String originalString = "Hello\nWorld\n123";
        //System.out.println(originalString.isBlank());
        //originalString.lines().forEach(System.out::println);
        String originalString1 = "  biezhi.me  23333  ";
        System.out.println(originalString1.strip());
        System.out.println(originalString1.stripLeading());
        System.out.println(originalString1.stripTrailing());
        String originalString2 = "hi";
        System.out.println(originalString2.repeat(2));
    }
}
