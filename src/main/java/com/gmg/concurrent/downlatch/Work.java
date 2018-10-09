package com.gmg.concurrent.downlatch;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/10/9  14:00
 */

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Work implements Runnable{


    private CountDownLatch downLatch;
    private String name;

    public Work(CountDownLatch downLatch, String name){
        this.downLatch = downLatch;
        this.name = name;
    }

    public void run() {
        this.doWork();
        try{
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        }catch(InterruptedException ie){
        }
        System.out.println(this.name + "活干完了！");
        this.downLatch.countDown();

    }

    private void doWork(){
        System.out.println(this.name + "正在干活!");
    }

}

