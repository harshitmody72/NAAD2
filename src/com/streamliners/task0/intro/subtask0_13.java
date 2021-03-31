package com.streamliners.task0.intro;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class subtask0_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));


    }
}
