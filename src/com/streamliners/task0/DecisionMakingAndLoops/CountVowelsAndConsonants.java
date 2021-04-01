package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        //Java Program to Count the Number of Vowels and Consonants in a Sentence

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vowelCount = 0,consonantCount = 0;
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelCount ++;
                }
                else
                    consonantCount++;
            }
        }

        System.out.println("No of vowels = "+vowelCount + "\nno of consonants = "+consonantCount);

    }
}
