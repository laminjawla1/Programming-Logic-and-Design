// 13. Time Calculator
// Design a Python program that asks the user to enter a number of seconds, and works as follows:
// • There are 60 seconds in a minute. If the number of seconds entered by the user is greater than or equal to 60, the
// program should display the number of minutes in that many seconds.
// • There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater than or equal to 3,600,
// the program should display the number of hours in that many seconds.
// • There are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400,
// the program should display the number of days in that many seconds.
package com.conditionals;

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double seconds;
        double minutes;
        double hours;
        double days;
        double weeks;
        double months;
        double years;

        System.out.print("Enter seconds: ");
        seconds = scanner.nextDouble();

        years = (int) (seconds / 3.154e+7);
        seconds = (int) (seconds % 3.154e+7);
        
        months = (int) (seconds / 2.628e+6);
        seconds = (int) (seconds % 2.628e+6);
        
        weeks = (int) (seconds / 604800);
        seconds = (int) (seconds % 604800);
        
        days = (int) (seconds / 86400);
        seconds = (int) (seconds % 86400);
        
        hours = (int) (seconds / 3600);
        seconds = (int) (seconds % 3600);
        
        minutes = (int) (seconds / 60);
        seconds = (int) (seconds % 60);

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        scanner.close();
    }
}
