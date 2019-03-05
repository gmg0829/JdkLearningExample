package com.gmg.anonymous;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/3/5  15:55
 */
abstract class Person {
    public abstract void eat();
}

public class Demo {
    public static void main(String[] args) {
      Person person=new Person() {
          @Override
          public void eat() {
              System.out.println("eat something");
          }
      };
      person.eat();
    }
}