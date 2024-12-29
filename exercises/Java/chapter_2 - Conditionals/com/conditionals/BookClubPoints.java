// 9. Book Club Points
// Serendipity Booksellers has a book club that awards points to its customers based on the number of books purchased
// each month. The points are awarded as follows:
// • If a customer purchases 0 books, he or she earns 0 points.
// • If a customer purchases 1 book, he or she earns 5 points.
// • If a customer purchases 2 books, he or she earns 15 points.
// • If a customer purchases 3 books, he or she earns 30 points.
// • If a customer purchases 4 or more books, he or she earns 60 points.
// Design a Python program that asks the user to enter the number of books that he or she has purchased this month and
// displays the number of points awarded.
package com.conditionals;

import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of books purchased
        System.out.print("Enter the number of books purchased this month: ");
        int numberOfBooksPurchased = scanner.nextInt();
        int points;

        // Determine the number of points awarded based on the books purchased
        if (numberOfBooksPurchased < 0) {
            System.out.println("Error: Number of books cannot be negative.");
            scanner.close();
            return;
        } else if (numberOfBooksPurchased == 0) {
            points = 0;
        } else if (numberOfBooksPurchased == 1) {
            points = 5;
        } else if (numberOfBooksPurchased == 2) {
            points = 15;
        } else if (numberOfBooksPurchased == 3) {
            points = 30;
        } else { // Covers 4 or more books
            points = 60;
        }

        // Display the points earned
        System.out.println("You have earned " + points + " points.");
        scanner.close();
    }
}
