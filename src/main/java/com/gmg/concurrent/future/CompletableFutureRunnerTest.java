package com.gmg.concurrent.future;

/**
 * @author gmg
 * @title: CompletableFutureRunnerTest
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/13 12:05
 */
import java.util.concurrent.*;

public class CompletableFutureRunnerTest {

    // 创建一个固定大小的线程池子
    static ExecutorService executor = Executors.newFixedThreadPool(3, new ThreadFactory() {
        int count = 1;

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "custom-executor-" + count++);
        }
    });

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 直接使用new 创建
        CompletableFuture newCompletable = new CompletableFuture();

        // 通过给定的值 创建一个 已经完成的 future
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
        System.out.println(cf.isDone());
        System.out.println(cf.getNow(null));

        // 使用 runAsync() 运行异步计算
        CompletableFuture<Void> completableFuture01 = CompletableFuture.runAsync(() -> {
            sleep();
            System.out.println("runAsync...");
        });

        CompletableFuture<Void> completableFuture02 = CompletableFuture.runAsync(() -> {
            sleep();
            System.out.println("runAsync...");
        }, executor);

        // 使用 supplyAsync() 运行一个异步任务并且返回结果
        CompletableFuture<String> completableFuture03 = CompletableFuture.supplyAsync(() -> {
            sleep();
            System.out.println("supplyAsync03...");
            return "hello world";
        });

        System.out.println(completableFuture03.isDone());

        // Block and wait for the future to complete
        System.out.println(completableFuture03.get());

        CompletableFuture<String> completableFuture04 = CompletableFuture.supplyAsync(() -> {
            sleep();
            System.out.println("supplyAsync04...");
            return "hello world";
        }, executor);

        System.out.println(completableFuture04.isDone());
        System.out.println(completableFuture04.get());

    }
}