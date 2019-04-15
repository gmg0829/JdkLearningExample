package com.gmg.design.factory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 工厂模式
 * @date 2018/9/17  15:49
 */
public class BikeFactory implements TrafficFactory {
    @Override
    public Traffic getTraffic() {
        return new Bike();
    }
}
