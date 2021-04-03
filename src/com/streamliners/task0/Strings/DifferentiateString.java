package com.streamliners.task0.Strings;

public class DifferentiateString {
    public static void main(String[] args) {
        //Java Program to Differentiate String == operator and equals() method
        String str1 = new String("Done");
        String str2 = new String("Done");
        System.out.println("Check Two Strings are Equal: ");
        boolean result1 = str1 == str2;
        System.out.println("Using == operator: "+ result1);
        boolean result2 = str1.equals(str2);
        System.out.println("Using equals(): "+ result2);
    }

}

