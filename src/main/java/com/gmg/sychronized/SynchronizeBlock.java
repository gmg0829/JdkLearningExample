
/**
 * 
 */
package com.gmg.sychronized;

/** 
* @ClassName: SynchronizeBlock 
* @Description: TODO
* @author gmg 
* @date 2017年9月21日 上午10:51:29  
*/
//　synchronized方法是一种粗粒度的并发控制，某一时刻，只能有一个线程执行该synchronized方法；
//　注意：被synchronized保护的数据应该是私有的。
//synchronized块则是一种细粒度的并发控制，只会将块中的代码同步，位于方法内、synchronized块之外的其他代码是可以被多个线程同时访问到的。
public class SynchronizeBlock
{
    public static void main(String[] args)
    {
        Example1 example = new Example1();

        Thread t1 = new Thread3(example);
        Thread t2 = new Thread4(example);

        t1.start();
        t2.start();
    }

}

class Example1
{
    private Object object = new Object();

    public void execute()
    {
        synchronized (object)
        {
            for (int i = 0; i < 20; ++i)
            {
                try
                {
                    Thread.sleep((long) Math.random() * 1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("Hello: " + i);
            }

        }

    }

    public void execute2()
    {
        synchronized (object)
        {
            for (int i = 0; i < 20; ++i)
            {
                try
                {
                    Thread.sleep((long) Math.random() * 1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("World: " + i);
            }

        }

    }

}

class Thread3 extends Thread
{
    private Example1 example;

    public Thread3(Example1 example)
    {
        this.example = example;
    }

    @Override
    public void run()
    {
        example.execute();
    }

}

class Thread4 extends Thread
{
    private Example1 example;

    public Thread4(Example1 example)
    {
        this.example = example;
    }

    @Override
    public void run()
    {
        example.execute2();
    }

}
