package com.gmg.factory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
  1，  一个对象拥有很多子类。

  2，  创建某个对象时需要进行许多额外的操作。

  3，  系统后期需要经常扩展，它把对象实例化的任务交由实现类完成，扩展性好。
 * @date 2018/9/17  15:48
 */
public interface TrafficFactory {
    Traffic getTraffic();
}
