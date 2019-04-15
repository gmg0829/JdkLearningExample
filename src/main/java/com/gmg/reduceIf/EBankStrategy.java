package com.gmg.reduceIf;

/**
 * @author gmg
 * @title: EBankStrategy
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/15 14:19
 */

public class EBankStrategy implements Strategy{

    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge*0.85;
    }

}

