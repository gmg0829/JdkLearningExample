package com.gmg.concurrent.cyclicBarrier;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/10/9  13:58
 */

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CycTest {

    public static void main(String[] args)
    {
        ExecutorService executorpool=Executors.newFixedThreadPool(3);
        CyclicBarrier cyclicBarrier= new CyclicBarrier(3);

        CycWork work1= new CycWork(cyclicBarrier, "张三" );
        CycWork work2= new CycWork(cyclicBarrier, "李四" );
        CycWork work3= new CycWork(cyclicBarrier, "王五" );

        executorpool.execute(work1);
        executorpool.execute(work2);
        executorpool.execute(work3);

        executorpool.shutdown();

    }

}
