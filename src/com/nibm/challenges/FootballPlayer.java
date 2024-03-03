package com.nibm.challenges;

public class FootballPlayer implements ISportEntity{
    private String playerName;
    private int jerseyNumber;

    public FootballPlayer(String playerName, int jerseyNumber) {
        this.playerName = playerName;
        //assign the value coming from the constructor to the current objects jersey number variable
        this.jerseyNumber = jerseyNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public void play() {
        System.out.println(playerName+" is on the field");

    }

    @Override
    public void displayInfo() {

        System.out.println("Player name is : "+playerName+" and player jersey number is "+ jerseyNumber);

    }
}
