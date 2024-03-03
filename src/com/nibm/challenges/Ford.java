package com.nibm.challenges;

public class Ford extends Car{

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +" engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" is braking";
    }
}
