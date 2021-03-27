package com.streamliners.task0;

import java.util.Scanner;

public class subtask0_6 {
    public static void main(String[] args) {
        //Java Program to Swap Two Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.format("Before Swapping :\na = %d \nb = %d",a,b);
        a = a+b;
        b = a-b;
        a = a - b;
        System.out.format("\nAfter Swapping : \na = %d \nb = %d",a,b);
    }
}
