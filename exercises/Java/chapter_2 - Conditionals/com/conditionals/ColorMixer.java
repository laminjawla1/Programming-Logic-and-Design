// 8. Color Mixer
// The colors red, blue, and yellow are known as the primary colors because they cannot be made by mixing other colors.
// When you mix two primary colors, you get a secondary color, as shown here:
// - When you mix red and blue, you get purple.
// - When you mix red and yellow, you get orange.
// - When you mix blue and yellow, you get green.
// Design a Python program that prompts the user to enter the names of two primary colors to mix. If the user enters
// anything other than “red,” “blue,” or “yellow,” the program should display an error message. Otherwise, the program
// should display the name of the secondary color that results.
package com.conditionals;

import java.util.Scanner;

public class ColorMixer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter color 1 and color 2 (red, blue, or yellow): ");
        String firstColor = scanner.next().trim().toLowerCase();
        String secondColor = scanner.next().trim().toLowerCase();

        // Combine colors into a single string for easier checking
        String combo = firstColor + " + " + secondColor;

        // Check color combinations
        switch (firstColor) {
            case "red" -> {
                if (secondColor.equals("blue")) {
                    System.out.println(combo + " = purple");
                } else if (secondColor.equals("yellow")) {
                    System.out.println(combo + " = orange");
                } else {
                    System.out.println("Error: Invalid color combination.");
                }
            }
            case "blue" -> {
                if (secondColor.equals("red")) {
                    System.out.println(combo + " = purple");
                } else if (secondColor.equals("yellow")) {
                    System.out.println(combo + " = green");
                } else {
                    System.out.println("Error: Invalid color combination.");
                }
            }
            case "yellow" -> {
                if (secondColor.equals("red")) {
                    System.out.println(combo + " = orange");
                } else if (secondColor.equals("blue")) {
                    System.out.println(combo + " = green");
                } else {
                    System.out.println("Error: Invalid color combination.");
                }
            }
            default -> System.out.println("Error: Invalid primary color entered.");
        }

        scanner.close();
    }
}
