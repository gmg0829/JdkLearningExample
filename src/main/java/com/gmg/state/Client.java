package com.gmg.state;

/**
 * @author gmg
 * @Title:
 * @Package 状态模式会更好的根据当前的状态去实施不同的行为，并且自主切换到另一个正确的状态，开变关，关变开。
 * @Description: 状态模式
 * @date 2018/9/18  17:54
 */
public class Client {
    public static void main(String[] args) {
        Switcher s = new Switcher();
        s.switchOn();
        s.switchOff();
        s.switchOn();
        s.switchOn();
    }
}
