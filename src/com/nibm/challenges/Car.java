package com.nibm.challenges;

public class Car {
    private String name;
    private int wheels;
    private int cylinders;
    private Boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String startEngine()
    {
        return "Car's Engine is starting";
    }

    public String accelerate()
    {
        return "Car is accelerating";
    }

    public String brake()
    {
        return "Car is braking";
    }
}
