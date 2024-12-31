// 3. Sum and product of numbers
// Design a Python program that asks the user to create a list of numbers. Then, the program should find the sum and
// product of numbers with odd indices.
package com.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAndProductOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the list from user input
        ArrayList<Integer> list = createList(scanner);

        // Check if the list is empty
        if (list.isEmpty()) {
            System.out.println("No numbers were entered.");
        } else {
            // Compute sum and product of numbers at odd indices
            int sumOfNumbers = 0;
            int productOfNumbers = 1;
            boolean hasOddIndices = list.size() > 1;

            for (int i = 1; i < list.size(); i += 2) {
                sumOfNumbers += list.get(i);
                productOfNumbers *= list.get(i);
            }

            // Display results
            System.out.println("List: " + list);
            System.out.println("Sum of numbers at odd indices: " + sumOfNumbers);
            System.out.println("Product of numbers at odd indices: " + (hasOddIndices ? productOfNumbers : 0));
        }

        scanner.close(); // Close the scanner
    }

    /**
     * Helper method to create a list of integers from user input.
     * @param scanner Scanner object for user input.
     * @return A list of integers.
     */
    static ArrayList<Integer> createList(Scanner scanner) {
        ArrayList<Integer> list = new ArrayList<>();
        String userInput;

        // Prompt user until they type "stop"
        while (true) {
            System.out.print("Enter a number (type 'stop' to finish): ");
            userInput = scanner.next();

            if (userInput.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                list.add(Integer.parseInt(userInput));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return list;
    }
}
