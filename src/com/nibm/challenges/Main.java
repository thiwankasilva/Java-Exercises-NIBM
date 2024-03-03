package com.nibm.challenges;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //psvm
    public static void main(String[] args) {
        //FootballPlayer footballPlayer = new FootballPlayer("Harsha",99);
        //footballPlayer.displayInfo();
        //footballPlayer.play();

        //This is the initial list
        List<String> lakersList = new ArrayList<>();
        lakersList.add("Kobe Bryant");
        lakersList.add("Harsha");
        lakersList.add("Hasini");
        lakersList.add("Hiruni");
        lakersList.add("Tharindu");

        BasketBallTeam lakers = new BasketBallTeam("Lakers",lakersList);
        lakers.play();
        lakers.displayInfo();
        lakers.addPlayer("Rushini");
        lakers.addPlayer("Amith");
        lakers.play();
        lakers.displayInfo();
        //this can be passed as an argument in the method call
        BasketBallTeam nibm = new BasketBallTeam("NIBM",lakersList);

        System.out.println(nibm.equals(lakers));

    }
}
