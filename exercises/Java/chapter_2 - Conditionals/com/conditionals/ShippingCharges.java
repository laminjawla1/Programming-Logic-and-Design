// 11. Shipping Charges

// The Fast Freight Shipping Company charges the following rates:
// Weight of Package                           Rate per Pound
// 2 pounds or less                            $1.10
// Over 2 pounds but not more than 6 pounds    $2.20
// Over 6 pounds but not more than 10 pounds   $3.70
// Over 10 pounds                              $3.80
// Design a Python program that asks the user to enter the weight of a package and then displays the shipping charges.
package com.conditionals;

import java.util.Scanner;

public class ShippingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = scanner.nextDouble();

        // Validate input
        if (weight <= 0) {
            System.out.println("Error: Weight must be a positive value.");
            scanner.close();
            return;
        }

        // Determine shipping charges
        double charges;
        if (weight <= 2) {
            charges = 1.10;
        } else if (weight <= 6) {
            charges = 2.20;
        } else if (weight <= 10) {
            charges = 3.70;
        } else {
            charges = 3.80;
        }

        // Display result
        System.out.printf("Weight of Package: %.2f pounds\n", weight);
        System.out.printf("Shipping Charges: $%.2f\n", charges);

        scanner.close();
    }
}
