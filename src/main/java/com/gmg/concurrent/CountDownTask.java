package com.gmg.concurrent;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.*;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/10/9  13:45
 */
public class CountDownTask {
    private static final int CORE_POOL_SIZE = 4;
    private static final int MAX_POOL_SIZE = 12;
    private static final long KEEP_ALIVE_TIME = 5L;
    private final static int QUEUE_SIZE = 1600;

    protected final static ExecutorService THREAD_POOL = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE,
            KEEP_ALIVE_TIME, SECONDS, new LinkedBlockingQueue<>(QUEUE_SIZE));
    public static void main(String[] args) throws InterruptedException {
        // 新建一个为5的计数器
        CountDownLatch countDownLatch = new CountDownLatch(5);
        THREAD_POOL.execute(() -> {
            System.out.println("当前任务Customer,线程名字为:" + Thread.currentThread().getName());
            countDownLatch.countDown();
        });
        THREAD_POOL.execute(() -> {
            System.out.println("当前任务Discount,线程名字为:" + Thread.currentThread().getName());
            countDownLatch.countDown();
        });
        THREAD_POOL.execute(() -> {
            System.out.println("当前任务Food,线程名字为:" + Thread.currentThread().getName());
            countDownLatch.countDown();
        });
        THREAD_POOL.execute(() -> {
            System.out.println("当前任务Tenant,线程名字为:" + Thread.currentThread().getName());
            countDownLatch.countDown();
        });
        THREAD_POOL.execute(() -> {
            System.out.println("当前任务OtherInfo,线程名字为:" + Thread.currentThread().getName());
            countDownLatch.countDown();
        });
        countDownLatch.await(1, SECONDS);
        System.out.println("主线程："+ Thread.currentThread().getName());
    }
}