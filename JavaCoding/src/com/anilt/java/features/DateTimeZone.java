package com.anilt.java.features;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DateTimeZone {
    public static void main(String[] args) {
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        //System.out.println(currentDateTime.toLocalDateTime());
        String instant = Instant.parse("2017-03-03T13:14:28.666Z").truncatedTo(ChronoUnit.DAYS).toString();
       // System.out.println(instant);

        ZonedDateTime currentDate = ZonedDateTime.now(ZoneOffset.UTC).with(LocalTime.of(0, 0));
        //System.out.println(currentDate);
        ZonedDateTime cDate = ZonedDateTime.now().with(LocalTime.of(0, 0));
        //System.out.println(cDate);

        ZonedDateTime startDate = ZonedDateTime.of(ZonedDateTime.now().getYear(),
                ZonedDateTime.now().getMonthValue(), ZonedDateTime.now().getDayOfMonth(),
                0,0,0,0,ZoneOffset.UTC);
       // System.out.println(startDate);

        Calendar cal = Calendar.getInstance();

        ZonedDateTime submissionDuedate = ZonedDateTime.ofInstant(cal.toInstant(), ZoneOffset.UTC);
        System.out.println(submissionDuedate);
        cal.add(Calendar.DATE, -1 * 1);
        submissionDuedate = ZonedDateTime.ofInstant(cal.toInstant(), ZoneOffset.UTC);
        System.out.println(submissionDuedate);
    }
}
