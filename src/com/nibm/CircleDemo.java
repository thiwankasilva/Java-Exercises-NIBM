package com.nibm;

import java.util.Scanner;

class CircleDemo {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter the radius: ");
        /*We are storing the entered radius in double
         * because a user can enter radius in decimals
         */
        double radius = sc.nextDouble();
        //Area = PI*radius*radius
        //static variables can be accessed using class name
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
        //Circumference = 2*PI*radius
        double circumference = Math.PI * 2 * radius;
        System.out.println("The circumference of the circle is:" + circumference);
    }
}

