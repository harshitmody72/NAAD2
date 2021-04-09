
package com.streamliners.task3_3;

public class Main {
    public static void main(String[] args) {
        TouristPlace jaipur = new TouristPlace("Hawa Mahal","6:00AM to 9:00PM",10);
        jaipur.addFamousFor("Honey Comb Style");
        jaipur.rate(6);
        jaipur.rate(8);
        jaipur.rate(10);
        jaipur.rate(11);
        jaipur.rate(12);
        jaipur.rate(18);
        System.out.println("Rating : " + jaipur.starRating);
    }
}