package com.gmg.factory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
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
