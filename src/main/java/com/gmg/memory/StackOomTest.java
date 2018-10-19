package com.gmg.memory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/10/19  17:22
 */
public class StackOomTest {
    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable {
        StackOomTest oom = new StackOomTest();
        oom.stackLeakByThread();
    }
}
