package com.patrick;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    //step 8 initializing hashmap
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();


    public static void main(String[] args) {

        //step 7 instance for scanner
        Scanner scanner = new Scanner(System.in);

        //step 9 locations
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing by a small building"));
        locations.put(2, new Location(2, "You are on a hill"));
        locations.put(3, new Location(3, "You are inside a building"));
        locations.put(4, new Location(4, "You are by a stream"));
        locations.put(5, new Location(5, "You are in a scary forest"));

        //step 10
        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDesription());
            if(loc == 0) {
                break;
            }

            loc = scanner.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("You cannot go in that direction");

                //run
                /*
                You are standing by a small building
                1
                You are standing by a small building
                2
                You are on a hill
                3
                You are inside a building
                4
                You are by a stream
                5
                You are in a scary forest
                0
                You are sitting in front of a computer learning Java
                 */

            }

        }

    }

}
