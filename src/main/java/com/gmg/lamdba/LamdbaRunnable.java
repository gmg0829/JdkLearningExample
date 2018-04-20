package com.gmg.lamdba;

public class LamdbaRunnable {
	static int b=10;
  public static void main(String[] args) {
	Thread thread=new Thread(()->{
		b++;
		System.out.println(b);
	}
	 		
	);
	thread.start();
}
}
