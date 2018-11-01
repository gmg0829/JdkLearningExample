package com.gmg.thread.ch3;

import java.util.stream.IntStream;

/**
 * Created by gmg on 2018/10/27.
 */
public class YieldDemo {
    public static void main(String[] args) {
        IntStream.range(0,2).mapToObj(YieldDemo::create).forEach(Thread::start);
    }
    private static Thread create(int index){
        return new Thread(()->{
           if (index==0)
               Thread.yield();
            System.out.println(index); //1,0
        });
    }
}
