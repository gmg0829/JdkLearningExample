package com.gmg.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by gmg on 2018/11/4.
 */
public class ReadFile
{
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream(new File("G:\\a.txt"));
            FileChannel fileChannel=fileInputStream.getChannel();
            ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileChannel.read(byteBuffer)) != -1) {
                // 注意先调用flip方法反转Buffer,再从Buffer读取数据
                byteBuffer.flip();

                // 有几种方式可以操作ByteBuffer
                // 1.可以将当前Buffer包含的字节数组全部读取出来
                bytes = byteBuffer.array();
                 System.out.print(new String(bytes));

                // 2.类似与InputStrean的read(byte[],offset,len)方法读取
              //  byteBuffer.get(bytes, 0, len);
                // System.out.print(new String(bytes, 0 ,len));

                // 3.也可以遍历Buffer读取每个字节数据
                // 一个字节一个字节打印在控制台,但这种更慢且耗时
                /* while(byteBuffer.hasRemaining()) {
                 System.out.print((char)byteBuffer.get());
                 }*/

                // 最后注意调用clear方法,将Buffer的位置回归到0
                byteBuffer.clear();

            }
            fileChannel.close();

            System.out.println((char)byteBuffer.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
