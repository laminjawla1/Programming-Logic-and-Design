// 4. Sum of Numbers – Part2.
// Design a Python program that calculates and prints the sum of cubes of even numbers up to a specified limit (e.g., 20)
// using a while loop.
package com.loops;

import java.util.Scanner;

public class SumOfNumbersPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int number = 2; // Start with the first even number
        while (number <= limit) {
            total += Math.pow(number, 3);
            number += 2; // Increment by 2 to only process even numbers
        }

        System.out.println("Sum of cubes of even numbers up to " + limit + ": " + total);

        scanner.close();
    }
}
