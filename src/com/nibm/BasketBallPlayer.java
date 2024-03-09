package com.nibm;

public class BasketBallPlayer extends Player{

    private String position;
    private int ballHandlingSkill;

    public BasketBallPlayer(String name, String age, int number, String position, int ballHandlingSkill) {
        super(name, age, number);
        this.position = position;
        this.ballHandlingSkill = ballHandlingSkill;
    }

    public String getPosition() {
        return position;
    }

    public int getBallHandlingSkill() {
        return ballHandlingSkill;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBallHandlingSkill(int ballHandlingSkill) {
        this.ballHandlingSkill = ballHandlingSkill;
    }

    @Override
    public String toString() {
        return "BasketBallPlayer{" +
                "name : "+ super.getName() +" "+
                "position='" + position + '\'' +
                ", ballHandlingSkill=" + ballHandlingSkill +
                '}';
    }
}
