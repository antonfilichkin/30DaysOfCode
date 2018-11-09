package ThirtyDaysOfCode.Day26;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d M y");

        String date = scanner.nextLine();
        LocalDate actual = LocalDate.parse(date, formatter);

        date = scanner.nextLine();
        LocalDate expected = LocalDate.parse(date, formatter);

        long days = ChronoUnit.DAYS.between(expected, actual);
        long years = actual.getYear()-expected.getYear();
        long months = actual.getMonthValue() - expected.getMonthValue();

        if (days > 0) {
            if (years > 0) {
                System.out.println(10000);
            } else if (months > 0) {
                System.out.println(months * 500);
            } else {
                System.out.println(days * 15);
            }
        } else {
            System.out.println(0);
        }


//        int[] date = new int[3];
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++){
//            date[i] = scanner.nextInt();
//        }
//        GregorianCalendar actual = new GregorianCalendar(date[2], date[1], date[0]);
//
//        scanner.nextLine();
//
//        for (int i = 0; i < 3; i++){
//            date[i] = scanner.nextInt();
//        }
//        GregorianCalendar expected = new GregorianCalendar(date[2], date[1], date[0]);
//
//        scanner.close();
//
//        System.out.println(actual);
//        System.out.println(expected);
//
//        expected.getGregorianChange(actual);

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

// 9 6 2015
// 6 6 2015

//15x day
//500x month