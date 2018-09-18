package com.gmg.state;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/18  17:52
 */
public class Off implements State {
    @Override
    public void switchOn(Switcher switcher) {
        switcher.setState(new On());
        System.out.println("OK...灯亮");
    }

    @Override
    public void switchOff(Switcher switcher) {
        System.out.println("WARN!!!断电状态无需再关");
        return;

    }
}
