package com.gmg.thread.ch1;

/**
 * Created by gmg on 2018/10/27.
 */
public class TicketWindowRunnable implements Runnable {
    private int index=1;
    private  static final int MAX=50;
    @Override
    public void run() {
      while (index<=MAX){
          System.out.println(Thread.currentThread()+"的号码是："+(index++));
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }

    public static void main(String[] args) {
        final TicketWindowRunnable ticketWindowRunnable=new TicketWindowRunnable();
        Thread thread1=new Thread(ticketWindowRunnable,"一号窗口");
        Thread thread2=new Thread(ticketWindowRunnable,"二号窗口");
        thread1.start();
        thread2.start();
    }
}
