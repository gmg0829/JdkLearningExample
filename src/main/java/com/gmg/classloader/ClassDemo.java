package com.gmg.classloader;

/**
 * @author gmg
 * @title: ClassDemo
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/28 10:16
 */
public class ClassDemo {
    public static void main(String[] args) {
      ClassLoader classLoader=ClassDemo.class.getClassLoader();
      while (classLoader!=null){
          System.out.println(classLoader.toString());
          classLoader=classLoader.getParent();
      }
    }
}
