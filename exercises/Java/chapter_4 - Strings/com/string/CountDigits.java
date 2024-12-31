// 1. Count digits in a string

// Design a Python program that will ask the user to enter a string.
// The program will count the sum of all digits in the string.
package com.string;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;           // Input string
        char c;             // Current character being inspected
        int total = 0;      // Sum of digits found
        int nDigits = 0;    // Total number of digits found
        int strLen;         // Length of the input string

        // Get some string from the user
        System.out.print("Enter some string: ");
        s = scanner.nextLine();

        // Visit every character in string s
        strLen = s.length();
        for (int i = 0; i < strLen; i++) {
            // Current Character
            c = s.charAt(i);

            // If the current character is a digit
            if (Character.isDigit(c)) {
                nDigits++;               // Increment the digit count
                total += c - '0';        // Convert char digit to int and add to the total
            }
        }

        // Display results
        System.out.println("Total Digits Found: " + nDigits);
        System.out.println("Sum Of The Digits Found: " + total);

        scanner.close(); // Close the scanner
    }
}
