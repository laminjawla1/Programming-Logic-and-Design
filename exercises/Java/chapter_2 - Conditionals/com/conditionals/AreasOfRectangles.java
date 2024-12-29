// 2. Areas of Rectangles
// The area of a rectangle is the rectangle's length times its width.
// Design a Python program that asks for the length and width of two rectangles.
// The program should tell the user which rectangle has the greater area, or whether the areas are the same.
package com.conditionals;

import java.util.Scanner;

public class AreasOfRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, width, areaOne, areaTwo;

        System.out.print("Enter length 1: ");
        length = scanner.nextInt();
        System.out.print("Enter width 1: ");
        width = scanner.nextInt();
        areaOne = length * width;

        System.out.print("Enter length 2: ");
        length = scanner.nextInt();
        System.out.print("Enter width 2: ");
        width = scanner.nextInt();
        areaTwo = length * width;

        if (areaOne > areaTwo)
            System.out.println("First rectangle is bigger");
        else if (areaTwo > areaOne)
            System.out.println("Second rectangle is bigger");
        else
            System.out.println("Both rectangles are equal");

        scanner.close();
    }
}
