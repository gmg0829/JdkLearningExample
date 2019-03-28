package com.gmg.formater;

import java.text.MessageFormat;

/**
 * @author gmg
 * @title: FormaterDemo
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/3/28 10:13
 */
public class FormaterDemo {
    public static void main(String[] args) {
        String message = "oh, {0} is a {1}";
        Object[] array = new Object[]{"ZhangSan","pig"};

        String value = MessageFormat.format(message, array);

        System.out.println(value);


        String message1 = "oh, {0,number,#.#} is a pig";
        Object[] array1 = new Object[]{new Double(3.1415)};

        String value1 = MessageFormat.format(message1, array1);

        System.out.println(value1);


        String url = "http://xxx.xxx.xxx?name=%s&age=%d";
        String path = String.format(url, "张三", 18);
        System.out.println(path);//http://xxx.xxx.xxx?name=张三&age=18
    }
}
