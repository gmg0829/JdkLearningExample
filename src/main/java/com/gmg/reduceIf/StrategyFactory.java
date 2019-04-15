package com.gmg.reduceIf;

/**
 * @author gmg
 * @title: StrategyFactory
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/15 14:20
 */

import java.util.HashMap;
import java.util.Map;


public class StrategyFactory {

    private static StrategyFactory factory = new StrategyFactory();
    private StrategyFactory(){
    }
    private static Map strategyMap = new HashMap<>();
    static{
        strategyMap.put(RechargeTypeEnum.E_BANK.value(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.value(), new BusiAcctStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.value(), new MobileStrategy());
        strategyMap.put(RechargeTypeEnum.CARD_RECHARGE.value(), new CardStrategy());
    }
    public Strategy creator(Integer type){
        return (Strategy)strategyMap.get(type);
    }
    public static StrategyFactory getInstance(){
        return factory;
    }
}

