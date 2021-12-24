package com.anilt.java.features;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeZone {
    public static void main(String[] args) {
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        System.out.println(currentDateTime.toLocalDateTime());
        currentDateTime.with(LocalTime.of(0, 0, 0, 0));
        System.out.println(currentDateTime.toLocalDateTime());
        String instant = Instant.parse("2017-03-03T13:14:28.666Z").truncatedTo(ChronoUnit.DAYS).toString();
        System.out.println(instant);
        ZonedDateTime startDate = ZonedDateTime.of(ZonedDateTime.now().getYear(),
                ZonedDateTime.now().getMonthValue(), ZonedDateTime.now().getDayOfMonth(),
                0,0,0,0,ZonedDateTime.now().getZone());
        System.out.println(startDate);
    }
}
