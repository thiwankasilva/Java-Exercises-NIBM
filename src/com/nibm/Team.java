package com.nibm;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {

    List<T> team = new ArrayList<>();

    public void addPlayer(T playerObject)
    {
        team.add(playerObject);
    }
    public void printAllMembers()
    {
        for(T player : team)
        {
            System.out.println(player);
        }
    }

    public static void main(String[] args) {
        Team<BasketBallPlayer> basketBallTeam = new Team();
        BasketBallPlayer player1 =
                new BasketBallPlayer("Harsha","24",89,"defence",80);
        BasketBallPlayer player2 =
                new BasketBallPlayer("Hirun","24",89,"defence",80);
        BasketBallPlayer player3 =
                new BasketBallPlayer("Pradeep","24",89,"defence",80);
        BasketBallPlayer player4 =
                new BasketBallPlayer("Dasun","24",89,"defence",80);

        basketBallTeam.addPlayer(player1);
        basketBallTeam.addPlayer(player2);
        basketBallTeam.addPlayer(player3);
        basketBallTeam.addPlayer(player4);

        basketBallTeam.printAllMembers();

        Team<CricketPlayer> cricketPlayerTeam = new Team<>();

        //cricketPlayerTeam.addPlayer(player4);


    }
}
