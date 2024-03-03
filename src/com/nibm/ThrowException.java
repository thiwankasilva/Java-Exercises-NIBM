package com.nibm;

public class ThrowException {
    //function to check if person is eligible to vote or not
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            //throw custom age exception if not eligible to vote
            throw new InvalidAgeException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    //main method
    public static void main(String args[]) {
        //calling the function
        try {
            validate(16);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
            System.out.println("Invalid age detected");
        }
        System.out.println("rest of the code...");
    }
}
