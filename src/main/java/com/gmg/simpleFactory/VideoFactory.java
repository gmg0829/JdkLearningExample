package com.gmg.simpleFactory;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/1/23  12:57
 */
public class VideoFactory {
    /**
     * 使用if else 判断类型，type 为 Java 则返回 JavaVideo， type为Python则返回 PythonVideo
     */
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 使用反射来创建对象
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
