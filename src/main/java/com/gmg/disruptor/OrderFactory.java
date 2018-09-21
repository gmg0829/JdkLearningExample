package com.gmg.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/21  11:35
 */
public class OrderFactory implements EventFactory<Order> {
    @Override
    public Order newInstance() {
        return new Order();
    }
}
