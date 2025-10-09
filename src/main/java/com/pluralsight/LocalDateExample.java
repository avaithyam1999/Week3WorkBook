package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(365 - LocalDate.now().getDayOfYear());

        //Local Time Example
        LocalTime time = LocalTime.now();
        System.out.println(time.getNano());

        //Date Time Formatter
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String formatted = now.format(formatter);

        System.out.println("Current date and time: " + formatted);
    }
}
