// 1. Total of a Series of Numbers
// Design a Python program that asks the user to enter a positive integer number and calculates the total of the following
// series of numbers: 1/n + 2/(n-1) + 3/(n-2) + 4/(n-3) + 5/(n-4) … + n/1
// (Hint, if you enter 4 then the program will calculate the total of 1/4 + 2/3 + 3/2 + 4/1)
package com.loops;

import java.util.Scanner;

public class TotalOfASeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int numerator = 1;
        int denominator;
        double total = 0;

        System.out.print("Enter a positive integer: ");
        number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            scanner.close();
            return;
        }

        denominator = number;

        System.out.print("The series is: ");
        while (numerator <= number) {
            total += (double) numerator / denominator;
            // Print each term of the series
            if (numerator < number)
                System.out.printf("%d/%d + ", numerator, denominator);
            else
                System.out.printf("%d/%d", numerator, denominator);
            
            numerator++;
            denominator--;
        }

        System.out.printf("\nTotal of the above series is: %.2f\n", total);
        scanner.close();
    }
}
