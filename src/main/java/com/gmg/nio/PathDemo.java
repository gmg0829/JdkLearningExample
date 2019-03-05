package com.gmg.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/3/5  11:04
 */
public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("c:\\data\\myfile.txt");
        Path file     = Paths.get("d:\\data", "projects\\a-project\\myfile.txt");
        Path currentDir = Paths.get(".");
        System.out.println(currentDir.toAbsolutePath());
    }
}
