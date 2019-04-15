package com.gmg.reduceIf;

/**
 * @author gmg
 * @title: CardStrategy
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/15 14:20
 */


public class CardStrategy implements Strategy{

    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge+charge*0.01;
    }

}
