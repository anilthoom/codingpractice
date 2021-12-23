package com.anilt.java.features;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeZone {
    public static void main(String[] args) {
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        System.out.println(currentDateTime.toLocalDateTime());
        currentDateTime.truncatedTo(ChronoUnit.DAYS);
        System.out.println(currentDateTime.toLocalDateTime());
        Instant instant = Instant.parse(currentDateTime.toString());
        System.out.println(instant.toString());
    }
}
