package com.nibm;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        String input = null;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a number :");
            int num = scanner.nextInt();
            System.out.print("Divide by :");
            int div = scanner.nextInt();

            double result = num / div;
            System.out.printf("Result : %f\n", result);
            input = scanner.nextLine();
        } while (input != null && !input.equalsIgnoreCase("quit"));
    }
}
