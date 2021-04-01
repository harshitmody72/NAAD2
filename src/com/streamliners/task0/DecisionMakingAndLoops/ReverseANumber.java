package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        //Java Program to Reverse a Number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int a = sc.nextInt();
        int reverse = 0;
        for(;a != 0;a /=10) {
            reverse = reverse * 10 + (a % 10);
        }
        System.out.println("Reverse : "+ reverse);

    }
}
