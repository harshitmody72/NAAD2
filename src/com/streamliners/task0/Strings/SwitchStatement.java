package com.streamliners.task0.Strings;

public class SwitchStatement {
    public static void main(String[] args) {
        //Java Program to Implement switch statement on strings
        String ch = "a";

        switch (ch) {
            case "a", "e","i","o","u" -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
