package com.streamliners.task0;

import java.util.Scanner;

public class subtask0_8 {
    public static void main(String[] args) {
        //java Program to Check Whether an Alphabet is Vowel or Consonant
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u','A','E','I','O','U' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
