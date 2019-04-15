package com.gmg.design.factory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 工厂方法模式(Factory Method Pattern)：定义一个用于创建对象的接口，
 *     让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类。
 * @date 2018/9/17  15:50
 */
public class TestFactory {
    public static void main(String[] args) {
        TrafficFactory trafficFactory=null;
        //bike
        trafficFactory=new BikeFactory();
        Traffic bike=trafficFactory.getTraffic();
        bike.gotwork();
        //bus
        trafficFactory=new BusFactory();
        Traffic bus=trafficFactory.getTraffic();
        bus.gotwork();
    }
}
