package com.gmg.design.template;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 模板方法模式
 * @date 2018/9/17  17:37
 */
public class Client {
    public static int[] a = { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 };
    public static void main(String[] args) {
        AbstractSort abstractSort=new ConcreteSort();
        abstractSort.showSortResult(a);
    }
}
