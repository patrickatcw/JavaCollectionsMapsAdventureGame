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

        //step 11 want to add exits for each location
        //for the game option for movement are limited to and from certain directions
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("Q", 0);

        //step 10
        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDesription());
            if(loc == 0) {
                break;
            }

            //step 12 directions
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            //step 13 scanner instance
            String direction = scanner.nextLine().toUpperCase();

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
                //run
            }

        }

    }

}
