package com.streamliners.task0.Strings;

public class CapitalizseFirstLetter {
    public static void main(String[] args) {
        //Java Program to Capitalize the first character of each word in a String

        String name = "harshit";
        String firstLetter = name.substring(0, 1);
        String remainingLetters = name.substring(1, name.length());
        firstLetter = firstLetter.toUpperCase();
        name = firstLetter + remainingLetters;
        System.out.println("Name: " + name);
    }
}
