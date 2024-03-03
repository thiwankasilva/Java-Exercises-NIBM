package com.nibm;

public class Divide {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int div = Integer.parseInt(args[1]);

            double result = num / div;
            System.out.printf("Result: %f\n", result);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number entered");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arguments missing");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unknown error occurred: " + e.getMessage());
        }
    }
}
