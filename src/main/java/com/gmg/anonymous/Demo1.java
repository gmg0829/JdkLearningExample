package com.gmg.anonymous;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/3/5  15:57
 */
interface Person1{
    public void eat();
}

public class Demo1{
    public static void main(String[] args) {
        Person1 p = new Person1() {
            @Override //此处方法重载 说明是实现父类  即内部类可以实现其他类 而且是必须
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();
    }
}
