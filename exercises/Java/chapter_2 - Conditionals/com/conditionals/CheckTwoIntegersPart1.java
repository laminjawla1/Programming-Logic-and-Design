// 3. Check Two Integers – Part1
// Design a Python program to check two given integers and return true if one of them is 30 or if their sum is 30.
package com.conditionals;

import java.util.Scanner;

public class CheckTwoIntegersPart1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter First Number: ");
        int secondNumber = scanner.nextInt();




        if ((firstNumber == 30 || secondNumber == 30) || (firstNumber + secondNumber == 30))
            System.out.println(true);
        else
            System.out.println(false);

        scanner.close();
    }
}
