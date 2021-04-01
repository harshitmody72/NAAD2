package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class CountNoOfDigit {
    public static void main(String[] args) {
        //Java Program to Count Number of Digits in an Integer
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while (num != 0 ){
            num = num/10;
            count++;

        }
        System.out.println("count = "+count);
    }
}
