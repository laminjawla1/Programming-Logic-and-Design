// 3. Sum of Numbers – Part1.
// Design a Python program with a loop that asks the user to enter a series of positive numbers. The user should enter a
// negative number to signal the end of the series. After all the positive numbers have been entered, the program should
// display their sum.
// 3. Sum of Numbers – Part1.
// Design a Python program with a loop that asks the user to enter a series of positive numbers. The user should enter a
// negative number to signal the end of the series. After all the positive numbers have been entered, the program should
// display their sum.
package com.loops;

import java.util.Scanner;

public class SumOfNumbersPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double total = 0;

        System.out.println("Enter positive numbers to sum (negative number to stop):");

        // Loop until a negative number is entered
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextDouble();

            // Check for termination condition
            if (number < 0) {
                break;
            }

            // Add positive numbers to the total
            total += number;
        }

        System.out.printf("The total sum of positive numbers is: %.2f\n", total);
        scanner.close();
    }
}
