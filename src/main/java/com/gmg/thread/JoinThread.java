/**
 * 
 */
package com.gmg.thread;

/**
* @ClassName: JoinThread 
* @Description: TODO
* @author gmg 
* @date 2017??8??16?? ????2:36:42  
*/
public class JoinThread extends Thread{
/* (non-Javadoc)
 * @see java.lang.Thread#run()
 */
	public JoinThread(String name){super(name);}
@Override
public void run() {
	for(int i=0;i<100;i++){
		System.out.println(getName()+"----"+i);
	}

}
	public static void main(String[] args) throws Exception {
		for(int i=0;i<100;i++){
			JoinThread joinThread=new JoinThread("joinThread");
			if(i==20){
				joinThread.start();
				joinThread.join();
			}
			System.out.println(Thread.currentThread().getName()+"+++"+i);
		}

	}
}
