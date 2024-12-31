// 4. Convert a list of characters into a string
// Design a Python program that asks the user to create a list of characters.
// Then, the program should convert it to a string
package com.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertAListOfCharactersToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the list of characters
        ArrayList<Character> list = createList(scanner);

        // Convert the list of characters to a string
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : list) {
            stringBuilder.append(c);
        }

        // Output the results
        System.out.println("List: " + list);
        System.out.println("String: \"" + stringBuilder + "\"");

        scanner.close(); // Close the scanner
    }

    /**
     * Helper function to create a list of characters
     *
     * @param scanner Scanner object for user input.
     * @return A list of characters entered by the user.
     */
    static ArrayList<Character> createList(Scanner scanner) {
        ArrayList<Character> list = new ArrayList<>();
        String userInput;

        // Prompt the user until they type "stop"
        while (true) {
            System.out.print("Enter a character (type 'stop' to finish): ");
            userInput = scanner.next();

            // Check for the stop condition
            if (userInput.equalsIgnoreCase("stop")) {
                break;
            }

            // Validate input length
            if (userInput.length() > 1) {
                System.out.println("Please enter only one character at a time.");
                continue;
            }

            // Add the character to the list
            list.add(userInput.charAt(0));
        }
        return list;
    }
}
