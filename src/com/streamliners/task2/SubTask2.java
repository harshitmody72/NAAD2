package com.streamliners.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubTask2 {

    public static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int last = -1;
        String[] array = s.split(";");

        int[] finalarr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            finalarr[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(finalarr);

        for (int next: finalarr) {
            if (next != last) {
                hm.put(next, 1);
            } else {
                hm.replace(next, hm.get(next) + 1);
            }
            last = next;
        }
        return hm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = sc.nextLine();
        HashMap<Integer, Integer> hm = getOccurrencesHashMap(string);
        System.out.println("The final string is:");
        for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}