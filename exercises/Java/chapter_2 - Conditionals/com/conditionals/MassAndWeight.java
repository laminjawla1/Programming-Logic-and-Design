// 6. Mass and Weight
// Scientists measure an object’s mass in kilograms and its weight in Newtons. If you know the amount of mass of an
// object, you can calculate its weight, in Newtons, with the following formula:
// Weight = Mass × 9.8
// Design a Python program that asks the user to enter an object’s mass, and then calculates its weight. If the object weighs
// more than 1,000 Newtons, display a message indicating that it is too heavy. If the object weighs less than 10 Newtons,
// display a message indicating that it is too light.
package com.conditionals;

import java.util.Scanner;

public class MassAndWeight {
    private static final double GRAVITATIONAL_CONSTANT = 9.81;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Mass: ");
        double mass = scanner.nextDouble();

        double weight = mass * GRAVITATIONAL_CONSTANT;
        if (weight > 1000)
            System.out.println("Too heavy");
        else if (weight < 10)
            System.out.println("Too light");
        else
            System.out.println("Optimal");
        scanner.close();
    }
}
