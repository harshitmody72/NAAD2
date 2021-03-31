package com.streamliners.task0.intro;

import java.util.Scanner;

public class subtask0_10 {
    public static void main(String[] args) {
        //Java Program to Find all Roots of a Quadratic Equation
        Scanner sc = new Scanner(System.in);
        // General Quadratic Equation ax^2 + bx + c
        System.out.println("Enter the value a,b,c respectively: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float root1;
        float root2;

        //First Find determinant
        // d = b^2 - 4ac
        float determinant = (b*b) - 4*a*c;

        if (determinant == 0){
            // roots are real and equal
            root1 = root2 = (-b) / (2*a);
            System.out.format("Roots are : %.2f, %.2f",root1 ,root2);
        }
        else if (determinant > 0){
            // roots are real and distinct
            root1 = (float) ((-b + Math.sqrt(determinant)) /(2*a));
            root2 = (float) ((-b - Math.sqrt(determinant)) /(2*a));
            System.out.format("Roots are : %.2f, %.2f",root1 ,root2);
        }
        else {
            //roots are complex
            float real = (-b) / (2*a);
            float imaginary = (float) (Math.sqrt(-determinant) / (2*a));
            System.out.format("Roots are : %.2f + %.2fi , %.2f - %.2fi",real,imaginary,real,imaginary);


        }
    }
}
