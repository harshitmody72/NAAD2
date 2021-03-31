package com.streamliners.task0.intro;

import java.util.Scanner;

public class subtask0_11 {
    public static void main(String[] args) {
        //Java Program to Find the Frequency of Character in a String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the Character : ");

        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i =0; i<str.length();i++){
            if (ch == str.charAt(i))
                count++;
        }
        System.out.println("The Frequency of " + ch + " = "+ count);

    }
}
