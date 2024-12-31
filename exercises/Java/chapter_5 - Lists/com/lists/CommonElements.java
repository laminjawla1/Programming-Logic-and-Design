// 2. Common elements in two lists
// Design a Java program that asks the user to create two lists of numbers of any sizes . Then, the program should find
// the common elements between the two lists.
package com.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the first list
        System.out.println("Create the first list:");
        ArrayList<Integer> firstList = createList(scanner);

        // Create the second list
        System.out.println("Create the second list:");
        ArrayList<Integer> secondList = createList(scanner);

        // Find the intersection of the two lists
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int number : firstList) {
            if (secondList.contains(number) && !intersection.contains(number)) {
                intersection.add(number);
            }
        }

        // Display results
        System.out.println("First List: " + firstList);
        System.out.println("Second List: " + secondList);
        System.out.println("Common Elements: " + intersection);

        scanner.close();
    }

    /**
     * Helper method to create a list of integers from user input.
     * @param scanner Scanner object for user input.
     * @return A list of integers.
     */
    static ArrayList<Integer> createList(Scanner scanner) {
        ArrayList<Integer> list = new ArrayList<>();
        String userInput;

        // Keep prompting the user until they type "stop"
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
