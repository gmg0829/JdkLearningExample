package com.gmg.thread.ch11;

import static java.lang.Thread.currentThread;

/**
 * Created by gmg on 2018/10/30.
 */
public class MainThread {
    public static void main(String[] args) {
        System.out.println(currentThread().getContextClassLoader());
    }
}
