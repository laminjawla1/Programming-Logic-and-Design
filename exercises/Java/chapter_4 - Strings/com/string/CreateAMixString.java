// 4. Create a mix string
// Design a Python program that will ask the user to enter three strings. The program will check the length of each string
// and use the length of the shortest as reference. Then the program will create and display a fourth string with the first
// character from each string, followed by the second character from each string till reaching the reference length.
package com.string;

import java.util.Scanner;

public class CreateAMixString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder mixedString = new StringBuilder();

        // Get three strings from the user
        System.out.print("Enter first string: ");
        String firstString = scanner.next();
        System.out.print("Enter second string: ");
        String secondString = scanner.next();
        System.out.print("Enter third string: ");
        String thirdString = scanner.next();

        // Find the shortest string length
        int referenceLen = Math.min(firstString.length(),
                        Math.min(secondString.length(), thirdString.length()));

        // Build the mixed string
        for (int i = 0; i < referenceLen; i++) {
            mixedString.append(firstString.charAt(i))
                    .append(secondString.charAt(i))
                    .append(thirdString.charAt(i));
        }

        // Display the result
        System.out.println("Mixed String: " + mixedString);

        scanner.close();
    }
}
