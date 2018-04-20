package com.gmg.time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateUtils {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
