// 10. Pennies for Pay
// Design a Python program that calculates the amount of money a person would earn over a period of time if his or her
// salary is one penny the first day, two pennies the second day, and continues to double each day. The program should ask
// the user for the number of days. Display the total pay at the end of the period. The output should be displayed in a dollar
// amount, not the number of pennies.
package com.loops;

import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long days; // Number of days
        long dailyPay = 1; // Pay for the current day in pennies
        double totalPayInPennies = 0; // Total pay in pennies

        // Prompt user for the number of days
        System.out.print("Enter the number of days: ");
        days = scanner.nextInt();

        // Validate the input
        if (days <= 0) {
            System.out.println("Error: Days must be positive.");
            scanner.close();
            return;
        }

        // Calculate the total pay
        for (long day = 1; day <= days; day++) {
            totalPayInPennies += dailyPay; // Add current day's pay to the total
            dailyPay *= 2; // Double the pay for the next day
        }

        // Convert total pay from pennies to dollars
        double totalPayInDollars = totalPayInPennies / 100;

        // Display the result
        System.out.printf("Total Pay for %d days is: $%.2f\n", days, totalPayInDollars);

        // Close the scanner
        scanner.close();
    }
}
