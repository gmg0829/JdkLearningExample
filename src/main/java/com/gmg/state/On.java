package com.gmg.state;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/18  17:51
 */
public class On implements State {
    @Override
    public void switchOff(Switcher switcher) {
        switcher.setState(new Off());
        System.out.println("OK...灯灭");
    }

    @Override
    public void switchOn(Switcher switcher) {
        System.out.println("WARN!!!通电状态无需再开");
        return;
    }
}
