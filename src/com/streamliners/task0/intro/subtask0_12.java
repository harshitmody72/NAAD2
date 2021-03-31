package com.streamliners.task0.intro;

import java.util.Scanner;

public class subtask0_12 {
    public static void main(String[] args) {
        //Java Program to Remove All Whitespaces from a String
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\s","");
        System.out.println("New string is "+str);

    }
}
