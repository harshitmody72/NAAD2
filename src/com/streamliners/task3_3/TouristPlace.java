package com.streamliners.task3_3;

import java.util.ArrayList;
import java.util.List;

public class TouristPlace {
    String name;
    String workingHour;
    int entryTicketPrice;
    int noOfRatings;
    float starRating;
    List<String> famousFor;
    //define parameterized constructor
    public TouristPlace(String name, String workingHour, int entryTicketPrice){
        this.name = name;
        this.workingHour = workingHour;
        this.entryTicketPrice = entryTicketPrice;
        this.famousFor = new ArrayList<>();
        this.noOfRatings = 0;
        this.starRating = 0;
    }
    void rate(int stars){
        if(stars > starRating){
            starRating = stars;
        }
        noOfRatings += stars;
    }
    TouristPlace addFamousFor(String s){
        famousFor.add(s);
        return this;
    }
    boolean isPlaceOpen(){
        return true;
    }
}