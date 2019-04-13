package com.gmg.concurrent.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureRunnerTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();

        //提交一个 Callable
        Future<Integer> f = es.submit(() -> {
            // 长时间的异步计算
            Thread.sleep(2000L);
            System.out.println("长时间的异步计算");
            return 100;
        });

        // 轮询
        while (true) {
            System.out.println("f.isDone");
            if (f.isDone()) {
                try {
                    System.out.println(f.get());
                    es.shutdown();
                    break;
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            Thread.sleep(100L);
        }
    }
}
