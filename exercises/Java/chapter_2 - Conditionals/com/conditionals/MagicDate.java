// 7. Magic Dates
// The date June 10, 1960, is special because when it is written in the following format, the month times the day equals the
// year:
// 6/10/60
// Design a Python program that asks the user to enter a month (in numeric form), a day, and a two-digit year. The program
// should then determine whether the month times the day equals the year. If so, it should display a message saying the
// date is magic. Otherwise, it should display a message saying the date is not magic.
package com.conditionals;

import java.util.Scanner;

public class MagicDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter day (dd), month (mm), and year (yy): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        // Check if the date is magic
        if (day * month == year) {
            System.out.printf("The date: %02d/%02d/%02d is magic.\n", day, month, year);
        } else {
            System.out.printf("The date: %02d/%02d/%02d is not magic.\n", day, month, year);
        }

        scanner.close();
    }
}
