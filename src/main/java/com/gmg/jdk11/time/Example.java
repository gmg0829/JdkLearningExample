package com.gmg.jdk11.time;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Example{
    public static void main(String[] args) {
        System.out.println(TimeUnit.MINUTES.convert(Duration.ofSeconds(120)));
        System.out.println(TimeUnit.DAYS.convert(Duration.ofHours(25)));
    }
}
