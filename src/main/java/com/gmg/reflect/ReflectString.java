package com.gmg.reflect;

import java.lang.reflect.Field;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/3/12  18:07
 */
public class ReflectString {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        String str = "不可变的字符串";

        System.out.println(str.hashCode()+":"+str);         //改变前的hash值

        Field f = str.getClass().getDeclaredField("value"); //获取value属性
        f.setAccessible(true);                              //设置其可以被访问(private)
        f.set(str, new char[] { '改', '变', '后', '的', '值' }); //改变其值

        System.out.println(str.hashCode()+":"+str);         //改变后的hash值
    }
}
