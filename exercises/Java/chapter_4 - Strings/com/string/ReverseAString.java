// 2. Reverse a string
// Design a Python program that will ask the user to enter a string. The program will reverse and display the string.
package com.string;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String s;   // Input String
        int strLen; // Length of the input string

        // Get some string from the user
        System.out.println("Enter a string: ");
        s = scanner.nextLine();

        // Visit each character in the input string from the end
        strLen = s.length();
        for (int i = strLen - 1; i >= 0; i--) {
            // Append each character to the string builder
            stringBuilder.append(s.charAt(i));
        }

        // Display the reversed string
        System.out.println("Reversed: " + stringBuilder.toString());

        scanner.close();    // Close the scanner
    }
}
