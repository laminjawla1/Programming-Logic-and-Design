// 12. First and Last
// Design a Python program that asks the user for a series of names (in no particular order). After the final person’s name
// has been entered, the program should display the name that is first alphabetically and the name that is last
// alphabetically. For example, if the user enters the names Kristin, Joel, Adam, Beth, Zeb, and Chris, the program will
// display Adam and Zeb.
package com.loops;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name; // Stores the current name entered by the user
        String first = null; // Alphabetically first name
        String last = null;  // Alphabetically last name

        System.out.println("Enter names (type 'stop' to finish):");

        while (true) {
            System.out.print("Enter a name: ");
            name = scanner.nextLine();

            // Terminate the loop if the user types "stop"
            if (name.equals("stop")) {
                break;
            }

            // Initialize first and last names on the first iteration
            if (first == null || last == null) {
                first = name;
                last = name;
            }

            // Compare and update first and last names
            if (first.compareTo(name) > 0) { // Current name is smaller
                first = name;
            }
            if (last.compareTo(name) < 0) { // Current name is larger
                last = name;
            }
        }

        // Check if names were entered
        if (first == null || last == null) {
            System.out.println("No names were entered.");
        } else {
            System.out.println("First (alphabetically): " + first);
            System.out.println("Last (alphabetically): " + last);
        }

        scanner.close(); // Close the scanner
    }
}
