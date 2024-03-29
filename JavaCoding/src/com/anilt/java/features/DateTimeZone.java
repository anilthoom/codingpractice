package com.anilt.java.features;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeZone {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        System.out.println(calendar.toInstant());

        // Java 8
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        String strDate = "2022-01-06T18:30Z[UTC]";
        Instant date = Instant.parse(strDate);
        System.out.println(date);
    }
}
