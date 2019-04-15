package com.gmg.reduceIf;

/**
 * @author gmg
 * @title: BusiAcctStrategy
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/15 14:19
 */


public class BusiAcctStrategy implements Strategy{

    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        // TODO Auto-generated method stub
        return charge*0.90;
    }

}

