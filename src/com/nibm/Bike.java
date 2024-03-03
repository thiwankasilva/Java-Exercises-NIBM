package com.nibm;

abstract class Bike{
    // we hide the implementation details
    abstract void startEngine();
    
}

//if we extend from an abstract class we should give method body to the abstract methods

class SuperCub extends Bike{
    void startEngine(){
        System.out.println("Started using Kick");
    }
    public static void main(String args[]){

        SuperCub obj = new SuperCub();
        obj.startEngine();
    }
}

class Scooty extends Bike{

    void startEngine(){
        System.out.println("Started using self start");
    }
    public static void main(String args[]){
        Scooty scooty = new Scooty();
        scooty.startEngine();
    }
}
