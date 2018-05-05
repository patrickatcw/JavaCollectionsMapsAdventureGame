package com.patrick;

import java.util.HashMap;
import java.util.Map;

//step 1 class
public class Location {

    //step 2 fields or variables
    private final int locationID;
    private final String desription;
    private final Map<String, Integer> exits;

    //step 3 constructor, for location id and description
    public Location(int locationID, String desription) {
        this.locationID = locationID;
        this.desription = desription;
        //step 4 manually set our exits up
        this.exits = new HashMap<String, Integer>();
        //step 14
        this.exits.put("Q", 0);
        //then back to main to run for step 15
    }

    //step 6 method for adding exits
    public void addExit(String direction, int location){
        exits.put(direction, location);

        //step 7 to main

    }

    //step 5 getters for all
    public int getLocationID() {
        return locationID;
    }

    public String getDesription() {
        return desription;
    }

    public Map<String, Integer> getExits() {
        //return exits;
        return new HashMap<String, Integer>(exits);
    }

}
