package com.streamliners.task0.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        //Java Program to Check if two strings are anagram

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a string: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1,charArray2);

            if(result)
                System.out.println(str1 + " and " + str2 + " are Anagram");
            else
                System.out.println(str1 + " and " + str2 + " are Not Anagram");
        }
        else
            System.out.println(str1 + " and " + str2 + " are Not Anagram");


    }
}
