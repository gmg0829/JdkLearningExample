package com.gmg.design.factory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/17  15:49
 */
public class BusFactory implements TrafficFactory {
    @Override
    public Traffic getTraffic() {
        return new Bus();
    }
}
