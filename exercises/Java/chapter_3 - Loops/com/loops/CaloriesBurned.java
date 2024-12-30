// 2. Calories Burned
// Running on a particular treadmill you burn 3.9 calories per minute. Design a Python program that uses a loop to display
// the number of calories burned after 10, 15, 20, 25, and 30 minutes.
package com.loops;

public class CaloriesBurned {
    // Constant for calories burned per minute
    final static double CALORIES_PER_MINUTE = 3.9;

    public static void main(String[] args) {
        System.out.println("Calories burned on the treadmill:");

        // Loop through specified time intervals
        for (int minute = 10; minute <= 30; minute += 5) {
            double caloriesBurned = CALORIES_PER_MINUTE * minute; // Calculate calories
            System.out.printf("%.2f calories burned in %d minutes\n", caloriesBurned, minute);
        }
    }
}

