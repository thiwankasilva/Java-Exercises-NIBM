package com.nibm;

public class PartTimeEmployee extends Employee {

    private int hourlyRate;
    private int numberOfHours;
    private int paperMarkingFee;

    public PartTimeEmployee(String name, String employeeId, int baseSalary, int hourlyRate, int numberOfHours, int paperMarkingFee) {
        super(name, employeeId, baseSalary);
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
        this.paperMarkingFee = paperMarkingFee;
    }

    @Override
    //Known as Runtime Polymorphism because it used the calculateBaseSalary method in the Employee class
    public int calculateBaseSalary() {
        return hourlyRate*numberOfHours+paperMarkingFee;
    }
}
