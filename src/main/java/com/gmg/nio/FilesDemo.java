package com.gmg.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/3/5  11:13
 */
public class FilesDemo {
    public static void main(String[] args) {
        //判断是否存在
        Path path = Paths.get("F:\\data");

        boolean pathExists =
                Files.exists(path,
                        new LinkOption[]{ LinkOption.NOFOLLOW_LINKS});
        try {
            //创建目录
            if (pathExists==false){
                Path newDir = Files.createDirectory(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Files.copy()方法从一个路径拷贝一个文件到另外一个目录
        Path sourcePath      = Paths.get("F:\\data\\logging.properties");
        Path destinationPath = Paths.get("F:\\data\\hello\\logging-copy.properties");
        try {
//            Files.copy(sourcePath, destinationPath);
            //强制覆盖现有文件
         /* Files.copy(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);*/
            //文件从一个路径移动到另一个路径
           Files.move(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
            //删除文件
            /*  Files.delete(path);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        //方法包含递归遍历目录树的功能。
        try {
            Files.walkFileTree(path, new FileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    System.out.println("pre visit dir:" + dir);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    System.out.println("visit file: " + file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    System.out.println("visit file failed: " + file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    System.out.println("post visit directory: " + dir);
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件搜索 以查找一个名为README.txt的文件
        Path rootPath = Paths.get("F:\\data");
        String fileToFind = File.separator + "README.txt";

        try {
            Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>() {

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    String fileString = file.toAbsolutePath().toString();
                    System.out.println("pathString = " + fileString);

                    if(fileString.endsWith(fileToFind)){
                        System.out.println("file found at path: " + file.toAbsolutePath());
                        return FileVisitResult.TERMINATE;
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch(IOException e){
            e.printStackTrace();
        }

        //递归删除目录
        Path rootPath1 = Paths.get("F:\\data\\to-delete");
        try {
            Files.walkFileTree(rootPath1, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    System.out.println("delete file: " + file.toString());
                    Files.delete(file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir);
                    System.out.println("delete dir: " + dir.toString());
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
