// 11. Largest and Smallest
// Design a Python program with a loop that lets the user enter a series of numbers. The user should enter –99 to signal the
// end of the series. After all the numbers have been entered, the program should display the largest and smallest numbers
// entered.
package com.loops;

import java.util.Scanner;

public class LargestAndSmallest {
    private static final int TERMINATOR = -99; // Sentinel value to end the input

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number; // Input number
        int smallest = Integer.MAX_VALUE; // Initial smallest value
        int largest = Integer.MIN_VALUE; // Initial largest value

        System.out.println("Enter numbers (-99 to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            // Check for sentinel value
            if (number == TERMINATOR) {
                break;
            }

            // Update smallest and largest as needed
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

        // Display results
        if (smallest == Integer.MAX_VALUE || largest == Integer.MIN_VALUE) {
            System.out.println("No valid numbers entered.");
        } else {
            System.out.println("Smallest: " + smallest);
            System.out.println("Largest: " + largest);
        }

        scanner.close(); // Close the scanner
    }
}
