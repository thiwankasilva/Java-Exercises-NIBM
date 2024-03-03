package com.nibm;

public class FullTimeEmployee extends Employee{
    private int bonus;


    public FullTimeEmployee(String name, String employeeId, int baseSalary,int bonus) {
        //name,employeeId,baseSalary will be initialized in super/parent class
        super(name, employeeId, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public int calculateBaseSalary() {
        return super.getBaseSalary()+bonus;
    }
}
