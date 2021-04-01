package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Java Program to Display Fibonacci Series
        int a = 0,b=1,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(a+", ");
            sum = a+b;
            a =b;
            b = sum;
        }

    }
}
