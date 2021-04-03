package com.streamliners.task0.Strings;

public class StringContainsSubstring {
    public static void main(String[] args) {
        String txt = "Harshit Mody";
        String str1 = "Harshit";

        boolean result = txt.contains(str1);
        if(result) {
            System.out.println(str1 + " is present in the string.");
        }
        else {
            System.out.println(str1 + " is not present in the string.");
        }

    }
}
