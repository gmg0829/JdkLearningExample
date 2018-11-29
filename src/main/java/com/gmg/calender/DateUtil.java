package com.gmg.calender;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gmg on 2018/11/3.
 */
public class DateUtil {
    private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };
    public static  String formatDate(Date date)throws ParseException {
        return threadLocal.get().format(date);
    }

    public static Date parse(String strDate) throws ParseException{
        return threadLocal.get().parse(strDate);
    }
}
