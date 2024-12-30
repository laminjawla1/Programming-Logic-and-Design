// 6. Sum of a Series of Integers – Part2.
// Design a Python program to calculate the series (1) + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n). The output
// should look like:
// 1=1
// 1+2 = 3
// 1+2+3 = 6
// …
// The sum of the above series is:
package com.loops;

import java.util.Scanner;

public class SumOfASeriesOfIntegersPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowSum; // To hold the sum of each row
        int n; // The input number
        int total = 0; // The total sum of the series

        System.out.print("Enter a positive number: ");
        n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Error: N must be positive.");
            scanner.close();
            return;
        }

        // Outer loop: Calculate each row of the series
        for (int i = 1; i <= n; i++) {
            rowSum = 0; // Reset row sum for each new row

            // Inner loop: Sum integers from 1 to i
            for (int j = 1; j <= i; j++) {
                rowSum += j;

                // Print the row terms
                if (j < i) {
                    System.out.printf("%d + ", j);
                } else {
                    System.out.printf("%d", j);
                }
            }

            // Print the row's sum and add it to the total
            System.out.printf(" = %d\n", rowSum);
            total += rowSum;
        }

        // Print the total sum of the series
        System.out.println("The sum of the above series is: " + total);

        scanner.close();
    }
}
