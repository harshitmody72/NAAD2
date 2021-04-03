package com.streamliners.task0.Arrays;

public class CalculateAverage {
    public static void main(String[] args) {
        //Java Program to Calculate Average Using Arrays
        int [] marks = {90,80,70,100,95};
        float sum = 0;
        for(int i =0; i<5;i++){
            sum+=marks[i];
        }
        float avg = sum / 5;
        System.out.println("Average Marks: "+avg);
    }
}
