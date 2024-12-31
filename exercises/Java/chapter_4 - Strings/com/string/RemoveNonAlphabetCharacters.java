// 3. Remove non alphabet characters
// Design a Python program that will ask the user to enter a string. The program will remove all non-alphabet characters
// (digits and symbols) and display the result.
package com.string;

import java.util.Scanner;

public class RemoveNonAlphabetCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder filteredString = new StringBuilder();
        String s;   // Input string
        int strLen; // Length of s
        char c;     // Current character
    
        // Get some string from the user
        System.out.print("Enter some string: ");
        s = scanner.nextLine();

        // Visit every character in string s
        strLen = s.length();
        for (int i = 0; i < strLen; i++) {
            // Remember the current character
            c = s.charAt(i);
            // If the current character is alphabetic
            // Store it in the filtered string builder
            if (Character.isAlphabetic(c)) {
                filteredString.append(c);
            }
        }

        // Display the filtered string
        System.out.println("Filtered String: " + filteredString);

        scanner.close();    // Close the scanner
    }
}
