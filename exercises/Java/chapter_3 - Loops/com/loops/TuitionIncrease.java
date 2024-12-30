// 8. Tuition Increase
// At one college, the tuition for a full-time student is $6,000 per semester. It has been announced that the tuition will
// increase by 2 percent each year for the next five years. Design a Python program with a loop that displays the projected
// semester tuition amount for the next five years.
package com.loops;

public class TuitionIncrease {
    public static void main(String[] args) {
        // Initial tuition fee
        double currentTuitionFee = 6000;

        // Loop through 5 years
        for (int year = 1; year <= 5; year++) {
            // Calculate the tuition fee increase
            currentTuitionFee += (0.02 * currentTuitionFee);

            // Display the tuition fee for the current year
            System.out.printf("Tuition Fee For Year %d is: $%.2f\n", year, currentTuitionFee);
        }
    }
}
