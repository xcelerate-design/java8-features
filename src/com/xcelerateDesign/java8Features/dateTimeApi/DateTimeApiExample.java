package com.xcelerateDesign.java8Features.dateTimeApi;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * A new Date-Time API is introduced to cover the following drawbacks of old date-time API.
 * 1. Not thread safe − java.util.Date is not thread safe,
 * thus developers have to deal with concurrency issue while using date.
 * The new date-time API is immutable and does not have setter methods.
 * 2. Poor design − Default Date starts from 1900, month starts from 1, and day starts from 0, so no uniformity.
 * The old API had less direct methods for date operations.
 * The new API provides numerous utility methods for such operations.
 * 3. Difficult time zone handling − Developers had to write a lot of code to deal with timezone issues.
 * The new API has been developed keeping domain-specific design in mind.
 * A new date-time API under the package java.time.
 * Important classes are:
 * Local − Simplified date-time API with no complexity of timezone handling.
 * Zoned − Specialized date-time API to deal with various timezones.
 */
public class DateTimeApiExample {

    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current dateTime: " + localDateTime);

        // print current date
        LocalDate currentDate = localDateTime.toLocalDate();
        System.out.println("Current date: " + currentDate);

        // print current time
        LocalTime currentTime = localDateTime.toLocalTime();
        System.out.println("Current time: " + currentTime);

        // provides method to get month, day, seconds
        Month month = localDateTime.getMonth();
        int day = localDateTime.getDayOfMonth();
        int seconds = localDateTime.getSecond();
        System.out.println("Month: " + month +" day: " + day +" seconds: " + seconds);

        // alter day of month and year
        LocalDateTime alteredLocalDateTime = localDateTime.withDayOfMonth(11).withYear(2018);
        System.out.println("Altered DateTime: " + alteredLocalDateTime);

        // year 2019, december, day 22
        LocalDate alteredLocalDate = LocalDate.of(2019, Month.DECEMBER, 22);
        System.out.println("Altered Date: " + alteredLocalDate);

        // 21 hour 15 minutes
        LocalTime alteredLocalTime = LocalTime.of(22, 15);
        System.out.println("Altered Time: " + alteredLocalTime);

        // parse a string
        LocalTime parsedLocalTime = LocalTime.parse("20:15:30");
        System.out.println("Parsed time: " + parsedLocalTime);

        // get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        // add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        // add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        // add 1 year to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);

        // add 10 years to the current date
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten year: " + nextDecade);

        // set zone "Europe/Paris" and print date
        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.now(), id);
        System.out.println("Zoned date: " + zonedDateTime);

    }

}