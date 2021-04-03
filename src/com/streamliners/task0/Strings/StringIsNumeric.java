package com.streamliners.task0.Strings;

public class StringIsNumeric {
    public static void main(String[] args) {
        //Java Program to Check if a String is Numeric
        String str = "48909.98";
        boolean result = true;

        try {
            Double num = Double.parseDouble(str);
        }
        catch (NumberFormatException e){
            result = false;
        }

        if(result)
            System.out.println(str + " is a number");
        else
            System.out.println(str + " not a number");

    }
}
