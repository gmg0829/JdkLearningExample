package com.gmg.generics;

/**
 * @author gmg
 * @title: GenericStack
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/25 13:54
 */
public class GenericStack<T> {
    private T[] elem;
    private int top;
    public GenericStack(){
        this(10);
    }
    public GenericStack(int size){
        // 不能new泛型类型的数组new T[]
        this.elem = (T[])new Object[size];
        this.top = 0;
    }

    /** 元素压栈 */
    public void push(T val){
        this.elem[this.top++] = val;
    }
    /** 元素出栈 */
    public void pop(){
        // 元素出栈后该位置置为null，防止内存泄漏
        this.elem[this.top-1] = null;
        --this.top;
    }
    /** 获取栈顶元素 */
    public T getTop(){
        return this.elem[this.top - 1];
    }

}
class TestDe{
    public static void main(String[] args) {
        GenericStack<Integer> s1 = new GenericStack<Integer>();
        s1.push(10);
        s1.push(20);
        int data = s1.getTop();
        System.out.println(data);
    }
}



