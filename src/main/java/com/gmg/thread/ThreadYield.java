/**
 * 
 */
package com.gmg.thread;

/** 
* @ClassName: ThreadYield 
* @Description: TODO
* @author gmg 
*/
public class ThreadYield extends Thread{
/* (non-Javadoc)
 * @see java.lang.Thread#run()
 */
	public ThreadYield(String name){super(name);}
@Override
public void run() {
	for (int i = 0; i < 100; i++) {
		System.out.println(getName()+"======"+i);
		if(i==20){
			Thread.yield();
		}
	}
}
public static void main(String[] args) {
	ThreadYield threadYield1=new ThreadYield("threadYield1");
	threadYield1.start();
	threadYield1.setPriority(Thread.MAX_PRIORITY);
	ThreadYield threadYield2=new ThreadYield("threadYield2");
	threadYield2.setPriority(Thread.MIN_PRIORITY);
	threadYield2.start();
}
}
