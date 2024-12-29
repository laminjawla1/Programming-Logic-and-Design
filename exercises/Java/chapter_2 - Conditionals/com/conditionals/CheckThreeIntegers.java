// 5. Check Three Integers
// Design a Python program to check the largest number among three given integers.
package com.conditionals;

import java.util.Scanner;

public class CheckThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter first number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter first number: ");
        int thirdNumber = scanner.nextInt();

        int largest = firstNumber;
        if (largest < secondNumber)
            largest = secondNumber;
        if (largest < thirdNumber)
            largest = thirdNumber;

        System.out.println("Largest: " + largest);

        scanner.close();
    }
}
