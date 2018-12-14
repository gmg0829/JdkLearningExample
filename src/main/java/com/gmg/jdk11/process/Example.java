package com.gmg.jdk11.process;

public class Example {
    public static void main(String[] args) {
        ProcessHandle currentHandle=ProcessHandle.current();
        System.out.println(currentHandle.pid());
    }
}
