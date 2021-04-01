package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        //Java Code To Create Pyramid and Pattern
        // Full Pyramid
        /* n = 5
            *
           * *
          * * *
         * * * *
        * * * * *
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j = 1; j<=n-i;j++)
                System.out.print(" ");
            for(int z = 1;z<=i;z++)
                System.out.print("* ");
            System.out.println("");
        }
    }
}
