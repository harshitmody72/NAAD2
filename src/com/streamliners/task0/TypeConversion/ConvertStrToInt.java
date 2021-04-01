package com.streamliners.task0.TypeConversion;

import java.util.Scanner;

public class ConvertStrToInt {
    public static void main(String[] args) {
        //java Program to convert string type variables into int
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String s = sc.nextLine();
        int a  = Integer.parseInt(s);
        System.out.println(a);
    }
}
