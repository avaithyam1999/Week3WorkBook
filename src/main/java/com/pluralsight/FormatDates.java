package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {
//        LocalDate todayDate = LocalDate.now();
//        LocalTime timeNow = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //10/09/2025
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //2025-10-09
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMM d, yyyy"); // Oct 9, 2025
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm"); //Thursday, Oct 9, 2025

        System.out.println(now.format(format1));
        System.out.println(now.format(format2));
        System.out.println(now.format(format3));
        System.out.println(now.format(format4));
    }
}
