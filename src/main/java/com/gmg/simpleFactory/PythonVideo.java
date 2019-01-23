package com.gmg.simpleFactory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/1/23  12:57
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
