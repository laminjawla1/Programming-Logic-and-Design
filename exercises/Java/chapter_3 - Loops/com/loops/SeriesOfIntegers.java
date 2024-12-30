// 9. Series of Integers
// Design a Python program to read a series of integers. The first integer is special, as it indicates how many more integers
// will follow. The output of the program will be the calculated the sum and average of the integers [excluding the first
// integer].
package com.loops;

import java.util.Scanner;

public class SeriesOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int number;
        int total = 0;
        double average;

        // Prompt user for the number of integers
        System.out.print("How many numbers will follow? ");
        n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Error: The count of numbers must be positive.");
            scanner.close();
            return;
        }

        // Read n integers and calculate total
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            total += number;
        }

        // Calculate average
        average = (double) total / n;

        // Display results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        // Close scanner
        scanner.close();
    }
}
