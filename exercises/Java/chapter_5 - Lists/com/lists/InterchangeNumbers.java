// 5. Interchange numbers
// Design a Python program that ask the user to create an even number list of digits. Then, the program should swap the
// first digit with the last digit, 2nd digit with the before last digit …etc.
package com.lists;

import java.util.Scanner;

public class InterchangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the list
        System.out.print("Enter the size of the list (must be positive and even): ");
        int listSize = scanner.nextInt();

        // Validate that the size is positive and even
        if (listSize <= 0 || listSize % 2 != 0) {
            System.out.println("Error: The size of the list must be a positive even number.");
            scanner.close();
            return;
        }

        // Initialize the list and read its elements
        int[] list = new int[listSize];
        for (int i = 0; i < listSize; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            list[i] = scanner.nextInt();
        }

        // Swap elements symmetrically
        int halfSize = listSize / 2;
        for (int i = 0; i < halfSize; i++) {
            int temp = list[i];
            list[i] = list[listSize - i - 1];
            list[listSize - i - 1] = temp;
        }

        // Display the interchanged list
        System.out.print("Interchanged List: ");
        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
