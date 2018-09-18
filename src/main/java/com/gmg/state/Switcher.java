package com.gmg.state;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/18  17:52
 */
public class Switcher {
    private State state = new Off();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void switchOn(){
        state.switchOn(this);
    }

    public void switchOff(){
        state.switchOff(this);
    }
}
