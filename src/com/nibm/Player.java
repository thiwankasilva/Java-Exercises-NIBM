package com.nibm;

public class Player {
    private String name;
    private String id;
    private String email;

    public Player(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    private void printValues(Player player)
    {
        System.out.println(player.name +" "+player.email);
    }
    public void callerMethod()
    {
        //passing the object of player to the printvalues method using this keyword
        printValues(this);
    }


}
