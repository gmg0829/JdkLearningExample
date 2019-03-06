package com.gmg.equals;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/3/6  9:26
 */
public class HashSetTestTwo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new Student(1, "zhangsan"));
        hs.add(new Student(2, "lisi"));
        hs.add(new Student(3, "wangwu"));
        hs.add(new Student(1, "zhangsan"));

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Student {
    int num;
    String name;

    Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

   /* @Override
    public int hashCode() {
        return num * name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        return num == s.num && name.equals(s.name);
    }*/

    @Override
    public String toString() {
        return num + ":" + name;
    }
}
