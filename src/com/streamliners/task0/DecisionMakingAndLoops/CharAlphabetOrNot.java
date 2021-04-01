package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class CharAlphabetOrNot {
    public static void main(String[] args) {
        //Java Program to Check Whether a Character is Alphabet or Not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);
        if ((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
            System.out.println("Character is Alphabet");

        }
        else
            System.out.println("Character is not Alphabet");
    }
}
