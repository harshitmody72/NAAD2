package com.streamliners.task0;

import java.util.Scanner;

public class subtask0_5 {
    public static void main(String[] args) {
        //Java Program to Compute Quotient and Remainder
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend : ");
        int divident = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();
        int remainder = divident % divisor;
        int quotient = divident / divisor;
        System.out.println("Quoteint = "+ quotient);
        System.out.println("Remainder = "+ remainder);


    }
}
