// 7. Right Angle Pattern
// Design a Python program that makes a pattern such as a right-angle triangle using numbers that repeat.
// 1
// 22
// 333
// 4444
// 55555
// …
// nnnnn
package com.loops;

import java.util.Scanner;

public class RightAnglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height;

        // Prompt the user for the height of the triangle
        System.out.print("Enter height: ");
        height = scanner.nextInt();

        // Validate input
        if (height <= 0) {
            System.out.println("Error: Height must be positive.");
            scanner.close();
            return;
        }

        // Outer loop for rows
        for (int row = 1; row <= height; row++) {
            // Inner loop for columns (printing the row number)
            for (int column = 1; column <= row; column++) {
                System.out.print(row);
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
