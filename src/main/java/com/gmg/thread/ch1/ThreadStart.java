package com.gmg.thread.ch1;

import java.util.stream.IntStream;

/**
 * Created by gmg on 2018/10/27.
 */
public class ThreadStart
{
    public static void main(String[] args) {
   /*  Thread thread=   new Thread(){
            @Override
            public void run() {
                enjoyMusic();
            }
        };
     thread.start();*/
   //JDK8
    new Thread(ThreadStart::enjoyMusic).start();
    }
    public static void enjoyMusic(){
        System.out.println("music");
    }
}
