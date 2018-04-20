/**
 * 
 */
package com.gmg.sychronized;

/** 
* @ClassName: StaticThread 
* @Description: TODO
* @author gmg 
* @date 2017年9月21日 上午10:58:52  
*/

//　所以如果是静态方法的情况（execute()和execute2()都加上static关键字），即便是向两个线程传入不同的Example对象，
//这两个线程仍然是互相制约的，必须先执行完一个，再执行下一个。
public class StaticThread
{
    public static void main(String[] args)
    {
        Example2 example = new Example2();

        Thread t1 = new Thread5(example);

        // 此处即便传入不同的对象，静态方法同步仍然不允许多个线程同时执行
        example = new Example2();

        Thread t2 = new Thread6(example);

        t1.start();
        t2.start();
    }

}

class Example2
{
    public synchronized static void execute()
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

    public synchronized static void execute2()
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

class Thread5 extends Thread
{
    private Example2 example;

    public Thread5(Example2 example)

    {
        this.example = example;
    }

    @Override
    public void run()
    {
        Example2.execute();
    }

}

class Thread6 extends Thread
{
    private Example2 example;

    public Thread6(Example2 example)
    {
        this.example = example;
    }

    @Override
    public void run()
    {
        Example2.execute2();
    }

}