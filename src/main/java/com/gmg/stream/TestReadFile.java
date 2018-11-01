package com.gmg.stream;

import java.awt.image.ImagingOpException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/11/1  13:27
 */
public class TestReadFile {
    public static void main(String args[]) {

        String fileName = "E://lines.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
