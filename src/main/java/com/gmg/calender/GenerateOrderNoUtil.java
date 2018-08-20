package com.gmg.calender;


import java.util.Random;

public class GenerateOrderNoUtil {

    public static String getFixLengthString(int i) {
        Random random = new Random();
        // 获得随机数
        double pross = (1 + random.nextDouble()) * Math.pow(10, i);
        // 转换成字符串
        String fixLengthStr = String.valueOf(pross);
        return fixLengthStr.substring(1, i + 1);
    }


    public static String generate(String payType) {
        long val1 = System.currentTimeMillis() / 1000 - 1000000000;
        String val2 = getFixLengthString(4);
        return val1 + payType + val2;
    }


    public static void main(String[] args) {
        System.out.println(GenerateOrderNoUtil.generate("5"));
    }
}
