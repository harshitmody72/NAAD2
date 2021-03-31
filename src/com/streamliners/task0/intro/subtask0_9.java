package com.streamliners.task0.intro;

import java.util.Scanner;

public class subtask0_9 {
    public static void main(String[] args) {
        //Java Program to Find the Largest Among Three Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;
        result = (a>b) ? ((a>c)? a:c):((b>c)?b:c);
        System.out.println("The largest among the three Number is : "+result);

    }
}
