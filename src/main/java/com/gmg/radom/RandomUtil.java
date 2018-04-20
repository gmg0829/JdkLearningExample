package com.gmg.radom;

import java.util.*;

/**
 * Created by gmg on on 2017-12-18 15:09.
 */
public class RandomUtil {
    public static void main(String[] args) {
        int ram=new Random().nextInt(10)*10000+100000;
        System.out.println(ram);
        System.out.println(getRandomString(7));
    }

    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
