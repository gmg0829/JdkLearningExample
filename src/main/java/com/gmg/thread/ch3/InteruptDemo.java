package com.gmg.thread.ch3;

import java.util.concurrent.TimeUnit;

/**
 * Created by gmg on 2018/10/27.
 */
public class InteruptDemo {
    public static void main(String[] args) throws  InterruptedException{
        Thread thread=new Thread(()->{
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        });
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        thread.interrupt();

    }
}
