package com.anilt.java.features;

import java.time.ZonedDateTime;

public class DateTimeZone {
    public static void main(String[] args) {
        ZonedDateTime currentDateTime = ZonedDateTime.now();

        System.out.println(currentDateTime.toLocalDateTime());
    }
}
