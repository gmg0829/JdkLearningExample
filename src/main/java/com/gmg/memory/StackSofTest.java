package com.gmg.memory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/10/19  17:18
 */
public class StackSofTest {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        StackSofTest oom = new StackSofTest();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
