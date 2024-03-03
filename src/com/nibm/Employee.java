package com.nibm;

public class Employee {

    private String name;
    private String employeeId;
    private int baseSalary;

    // Let's initialize using a constructor
    public Employee(String name, String employeeId, int baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateBaseSalary()
    {
        return baseSalary;
    }
}
