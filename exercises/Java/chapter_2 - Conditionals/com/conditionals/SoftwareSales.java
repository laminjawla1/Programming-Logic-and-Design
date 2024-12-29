// 10. Software Sales
// A software company sells a package that retails for $99. Quantity discounts are given according to the following table:
// Quantity    Discount
// 10 - 19     20%
// 20 - 49     30%
// 50 - 99     40%
// >= 100      50%
// Design a Python program that asks the user to enter the number of packages purchased.
// The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount.
package com.conditionals;

import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double UNIT_PRICE = 99.0; // Package unit price
        double discountPercent;
        double totalPrice;
        double discountAmount;
        double finalPrice;

        // Prompt user for quantity
        System.out.print("Enter the number of packages purchased: ");
        int quantity = scanner.nextInt();

        // Input validation
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be a positive number.");
            scanner.close();
            return;
        }

        // Determine discount percentage based on quantity
        if (quantity >= 100) {
            discountPercent = 50;
        } else if (quantity >= 50) {
            discountPercent = 40;
        } else if (quantity >= 20) {
            discountPercent = 30;
        } else if (quantity >= 10) {
            discountPercent = 20;
        } else {
            discountPercent = 0; // No discount for less than 10 packages
        }

        // Calculate total price, discount amount, and final price
        totalPrice = quantity * UNIT_PRICE;
        discountAmount = (discountPercent / 100) * totalPrice;
        finalPrice = totalPrice - discountAmount;

        // Display results
        System.out.println("\n--- Purchase Summary ---");
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit Price: $%.2f\n", UNIT_PRICE);
        System.out.printf("Total Price: $%.2f\n", totalPrice);
        System.out.printf("Discount Percent: %.1f%%\n", discountPercent);
        System.out.printf("Discount Amount: $%.2f\n", discountAmount);
        System.out.printf("Final Price: $%.2f\n", finalPrice);

        scanner.close();
    }
}
