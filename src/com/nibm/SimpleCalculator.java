package com.nibm;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    //Constructor name should be equal to the class name
    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public double getFirstNumber()
    {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
    //setting a number means updating a number

    public void setFirstNumber(double updatedFirstNumber)
    {
        this.firstNumber = updatedFirstNumber;
    }
    public void setSecondNumber(double updatedSecondNumber)
    {
        this.secondNumber = updatedSecondNumber;
    }

    //method to get the sum
    public double getAdditionResult()
    {
        double sum = firstNumber+secondNumber;
        return sum;
    }

    public double getDivisionResult()
    {
        if(secondNumber == 0)
        {
            System.out.println("This cannot be divided by zero");
            return -1;
        }
        else
        {
            double result = firstNumber/secondNumber;
            return result;
        }


    }

}
