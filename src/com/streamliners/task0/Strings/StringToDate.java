package com.streamliners.task0.Strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {
        //Java Program to Convert String to Date

        String str = "2021-03-29";
        //Format y-m-d
        LocalDate date = LocalDate.parse(str , DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
