// 1. Roman Numerals

// Design a Python program that prompts the user to enter a number within the range of through 10.
// The program should display the Roman numeral version of that number.
// If the number is outside the range of 1 through 10, the program should display an error message.
package com.conditionals;

import java.util.Scanner;

public class RomanNumeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");
        }

        scanner.close();
    }
}
