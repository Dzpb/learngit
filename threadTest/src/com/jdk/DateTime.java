package com.jdk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(localDateTime));

        System.out.println("--------------------------------------");


        System.out.println(localDateTime.with(TemporalAdjusters.firstDayOfMonth()));

    }
}
