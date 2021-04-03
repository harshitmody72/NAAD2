package com.streamliners.task0.Arrays;

import java.util.Arrays;

public class ConcatenateTwoArrays {
    public static void main(String[] args) {
        //Java Program to Concatenate Two Arrays
        int [] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int n = arr1.length + arr2.length;
        int [] arrsum = new int[n];
        int i = 0;

        for(int element:arr1){
            arrsum[i] = element;
            i++;
        }

        for(int element:arr2){
            arrsum[i] = element;
            i++;
        }

        System.out.println(Arrays.toString(arrsum));

    }
}
