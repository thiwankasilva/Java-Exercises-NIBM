package com.nibm.challenges;

import java.util.List;

public class BasketBallTeam implements ISportEntity {

    private String teamName;

    //This is a list of string
    // reason for not selecting arrays is its size is fixed
    //but list doesn't have a size
    private List<String> players;

    public BasketBallTeam(String teamName, List<String> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public void addPlayer(String playerName) {
        players.add(playerName);
    }


    @Override
    public void play() {
        System.out.println("Basketball team is on the court");
    }

    @Override
    public void displayInfo() {
        System.out.println("Team name is : " + teamName);
        int i = 1;
        for (String player : players) {
            System.out.println("Team Member " + i + " :" + player);
            i++;

        }
    }

    @Override
    public String toString() {
        return "BasketBallTeam{" +
                "teamName='" + teamName + '\'' +
                '}';
    }
}

