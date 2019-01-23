package com.gmg.simpleFactory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 简单工厂模式(Simple Factory Pattern)：定义一个工厂类，
 *             它可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。
 * @date 2019/1/23  12:58
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video1 = videoFactory.getVideo("python");
        if (video1 == null) {
            return;
        }
        video1.produce();

        Video video2 = videoFactory.getVideo(JavaVideo.class);
        if (video2 == null) {
            return;
        }
        video2.produce();
    }
}
