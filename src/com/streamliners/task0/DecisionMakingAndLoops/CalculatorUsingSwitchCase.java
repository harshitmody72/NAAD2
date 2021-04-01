package com.streamliners.task0.DecisionMakingAndLoops;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        //Java Program to Make a Simple Calculator Using switch...case
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.print("Enter the operator(+,-,*,/): ");
        char operator = sc.next().charAt(0);
        double result;

        switch (operator) {
            case '+' -> {
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
            }
            case '-' -> {
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            }
            case '*' -> {
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
            }
            case '/' -> {
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
            }
            default -> System.out.println("Wrong Input!!!!!!");
        }
    }
}
