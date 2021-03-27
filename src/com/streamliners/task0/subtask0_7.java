package com.streamliners.task0;

import java.util.Scanner;

public class subtask0_7 {
    public static void main(String[] args) {
        //Java Program to Check Whether a Number is Even or Odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Number is Even");
        }
        else
            System.out.println("Number is Odd");
    }
}
