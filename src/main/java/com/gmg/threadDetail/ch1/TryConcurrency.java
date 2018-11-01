package com.gmg.threadDetail.ch1;

import java.util.concurrent.TimeUnit;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/10/24  15:43
 */
public class TryConcurrency {
    private static void news(){
        for (; ; ) {
            System.out.println("read news");
            sleep(1);
        }
    }
    private static void music(){
        for (; ; ) {
            System.out.println("listen music");
            sleep(1);

        }
    }

    private static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
      new Thread(TryConcurrency::music).start();
      news();
    }
}
