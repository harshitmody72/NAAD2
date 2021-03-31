package com.streamliners.task0.intro;

import java.util.Scanner;

public class subtask0_14 {
    public static void main(String[] args) {
        //Java Program to Check if a String is Empty or Null

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        if(str == null || str.equals("")){
            System.out.println("String is Empty or null");
        }
        else
            System.out.println("String is not Empty or null");

    }
}
