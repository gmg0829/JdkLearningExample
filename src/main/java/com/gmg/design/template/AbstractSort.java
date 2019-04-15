package com.gmg.design.template;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/17  17:35
 */
public abstract class AbstractSort {
    protected abstract void sort(int[] arrray);

    public void showSortResult(int[] array){
        this.sort(array);
        System.out.print("排序结果：");
        for (int i = 0; i < array.length; i++){
            System.out.printf("%3s", array[i]);
        }
    }
}
