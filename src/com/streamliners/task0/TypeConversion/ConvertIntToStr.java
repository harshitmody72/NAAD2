package com.streamliners.task0.TypeConversion;

import java.util.Scanner;

public class ConvertIntToStr {
    public static void main(String[] args) {
        //Java Program to convert int type variables to String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        String str = String.valueOf(a);
        System.out.println(str);
    }
}
