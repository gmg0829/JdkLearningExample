package com.gmg.classloader;

import java.net.URL;
import java.net.URLClassLoader;
import java.security.cert.Extension;

/**
 * @author gmg
 * @title: ClassDemo
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/28 10:16
 */
public class ClassDemo {
    public static void main(String[] args) throws Exception{
      ClassLoader classLoader=ClassDemo.class.getClassLoader();
      while (classLoader!=null){
          System.out.println(classLoader.toString());
          classLoader=classLoader.getParent();
      }
       // URLClassLoader
//        ClassLoader
        Thread.currentThread().getContextClassLoader().loadClass("");
        ClassLoader.getSystemClassLoader().loadClass("");


        String v1dir = "file:///Users/qianwp/source/jcl/v1/";
        URLClassLoader v1 = new URLClassLoader(new URL[]{new URL(v1dir)});

        Class<?> depv1Class = v1.loadClass("Dep");
        Object depv1 = depv1Class.getConstructor().newInstance();
        depv1Class.getMethod("print").invoke(depv1);

    }
}
