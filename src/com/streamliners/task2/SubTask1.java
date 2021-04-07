package com.streamliners.task2;

import java.util.ArrayList;
import java.util.List;

public class SubTask1 {

    public static void main(String[] args) {

        System.out.println(getList("1;2;3;4"));
    }

    private static List<Integer> getList(String s) {
        //Write your code here!
        ArrayList<Integer> List = new ArrayList<>();
        String[] arrstr = s.split(";");
        for(int i = 0 ; i<arrstr.length;i++){
            List.add(Integer.parseInt(arrstr[i]));
        }

        return List;
    }

}
