package com.gmg.state;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/18  17:51
 */
public interface State {
    public void switchOn(Switcher switcher);//开
    public void switchOff(Switcher switcher);//关
}
