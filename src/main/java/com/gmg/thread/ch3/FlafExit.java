package com.gmg.thread.ch3;

import java.util.concurrent.TimeUnit;

/**
 * Created by gmg on 2018/10/27.
 */
public class FlafExit
{

    static  class MyTask extends Thread{
        private volatile boolean closed=false;

        @Override
        public void run() {
            System.out.println("work");
            while (!closed && !isInterrupted()){
                System.out.println("working");
            }
            System.out.println("I exit");
        }
        public void closed(){
            this.closed=true;
            this.interrupt();
        }
    }
    public static void main(String[] args) throws InterruptedException{

        MyTask myTask=new MyTask();
        myTask.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("will be shutdown");
        myTask.closed();

    }
}
