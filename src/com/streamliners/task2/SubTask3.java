package com.streamliners.task2;

import java.util.Scanner;

public class SubTask3 {
    public static void StartGame(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                char randomChar = s.charAt(i);
                sb.append(randomChar);
            }
            else {
                count++;
                sb.append('_');
            }
        }
        int chances = count + 3;
        System.out.println(sb.toString());
        String update = sb.toString();
        while (chances!=0){
            System.out.println("Chances :" + chances);
            char g;
            Scanner sc = new Scanner(System.in);
            System.out.print("Guess: ");
            g = sc.next().charAt(0);

            int counting=0;
            for (int i = 0; i <update.length() ; i++) {
                if (g==s.charAt(i)){
                    update = update.substring(0,i) + g + update.substring(i+1);
                    counting++;
                }
            }
            if (update.equals(s)){
                System.out.println("YOU WON!!");
                return ;
            }
            System.out.println("Character found " + counting + " times.");
            chances--;
        }
        System.out.println("YOU LOST THE GAME");
    }

    public static void main(String[] args) {
        System.out.println("Enter a name: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StartGame(s);
    }

}