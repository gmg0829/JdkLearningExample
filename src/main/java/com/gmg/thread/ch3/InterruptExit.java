package com.gmg.thread.ch3;

import java.util.concurrent.TimeUnit;

/**
 * Created by gmg on 2018/10/27.
 */
public class InterruptExit
{
    public static void main(String[] args) throws InterruptedException{
        Thread thread=new Thread(){
            @Override
            public void run() {
                System.out.println("work");
                while (!isInterrupted()){
                    System.out.println("working");
                }
                System.out.println("I exit");

            }
        };
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("will be shutdown");
        thread.interrupt();
    }
}
