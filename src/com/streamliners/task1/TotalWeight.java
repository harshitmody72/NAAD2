package com.streamliners.task1;

import java.util.Scanner;

public class TotalWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string =");
        String str = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter no of elements in array :");
        int n = sc1.nextInt();
        int[] weights = new int[10];
        System.out.println("Enter the elements of array :");
        for(int i = 0; i < n; i++){
            weights[i] = sc1.nextInt();
        }

        int count = weightCal(str, weights);
        System.out.println(count);

    }

    public static int weightCal(String str, int[] weights){
        int count = 0;
        for( int i = 0;i <str.length(); i++){
            if(str.charAt(i) == 'A')
                count += weights[0];
            if(str.charAt(i) == 'B')
                count += weights[1];
            if(str.charAt(i) == 'C')
                count += weights[2];
            if(str.charAt(i) == 'D')
                count += weights[3];
            if(str.charAt(i) == 'E')
                count += weights[4];
        }
        return count;
    }
}