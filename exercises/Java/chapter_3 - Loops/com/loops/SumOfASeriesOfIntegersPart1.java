// 5. Sum of a Series of Integers - Part1.
// Design a Python program to calculate the sum of the series (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n). The output
// should look like:
// 1*1 = 1
// 2*2 = 4
// 3*3 = 9
// …
// The sum of the above series is:
package com.loops;

import java.util.Scanner;

public class SumOfASeriesOfIntegersPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Error: N must be a positive integer.");
            scanner.close();
            return;
        }

        // Calculate the series and display each term
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.printf("%d x %d = %d\n", i, i, square);
            total += square;
        }

        // Display the total sum
        System.out.println("The sum of the above series is: " + total);
        scanner.close();
    }
}
