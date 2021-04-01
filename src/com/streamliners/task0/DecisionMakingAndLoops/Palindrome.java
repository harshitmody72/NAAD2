package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Java Program to Check Whether a Number is Palindrome or Not

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int a = sc.nextInt();
        int original = a;
        int reverse = 0;
        for(;a != 0;a /=10) {
            reverse = reverse * 10 + (a % 10);
        }
        //System.out.println("Reverse : "+ reverse);
        if(original == reverse)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is Not Palindrome");
    }
}
