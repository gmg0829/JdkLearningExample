package com.gmg.reflect;

import java.lang.reflect.Method;

/**
 * @author gmg
 * @title: ParseAnnotation
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2020/1/19 14:13
 */
@MyRequestMapping(uri = "uuu")
public class ParseAnnotation {

    @MyRequestMapping(desc = "The class method", uri = "com.test.annotation.Test#setId")
    public void setId(String id) {
        System.out.println(" method info: "+id);
    }

    public static void main(String[] args) {

        Class<ParseAnnotation> c=ParseAnnotation.class;
        MyRequestMapping myRequestMapping=c.getAnnotation(MyRequestMapping.class);
       if (c.isAnnotationPresent(MyRequestMapping.class)){
           System.out.println(myRequestMapping.desc());
       }

       Method[] methods=c.getMethods();
        for (Method m:methods
             ) {
            if (m.isAnnotationPresent(MyRequestMapping.class))
            {
                MyRequestMapping myRequestMapping1=m.getAnnotation(MyRequestMapping.class);
                System.out.println(myRequestMapping1.uri());
            }
        }


    }
}
