package com.gmg.calender;

import java.nio.DoubleBuffer;
import java.nio.IntBuffer;
import java.nio.channels.Pipe;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by gmg on on 2017-12-18 13:58.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        Calendar calendar1=Calendar.getInstance();
        //System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        calendar.add(Calendar.DATE,7);
       if(calendar.after(calendar1)){
            //System.out.println(1);
        }else{
           // System.out.println(0);
        }
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd 00:00:00");
       try {
           String s=simpleDateFormat.format(calendar.getTime());
           Date date=simpleDateFormat.parse(s);
           //System.out.println(date);
       }catch (Exception e){
           e.printStackTrace();
       }
        double ran = new Random().nextDouble();
         //System.out.println(ran);
       //System.out.println(simpleDateFormat.format(date));
        // System.out.println(calendar.get(2));
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy:MM:dd  00:00:00",Locale.CHINA);
        Calendar cal=Calendar.getInstance(Locale.CHINA);
        //cal.setFirstDayOfWeek(Calendar.MONDAY);

        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        //System.out.println(sdf.format(cal.getTime()));
        int[] arr={1,2,3};
        List list=Arrays.asList(arr);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(x -> System.out.println(x));
    }


}
