// 4. Check Two Integers – Part2
// Design a Python program to check a given integer and return true if it is within 10 of 100 or 10 of 200.
package com.conditionals;

import java.util.Scanner;

public class CheckTwoIntegersPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if ((n >= 90 && n <= 110) || n >= 190 && n <= 210)
            System.out.println(true);
        else
            System.out.println(false);

        scanner.close();
    }
}
