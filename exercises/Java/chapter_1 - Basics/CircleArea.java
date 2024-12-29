//7. Area of a Circle
//Design a Python program that will ask the user to enter the radius of a circle. The program should then compute the area
//of the circle and display the result. (Hint: area of the circle is pi*r2

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.####");

        System.out.print("Enter radius: ");
        float radius = scanner.nextFloat();

        final double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area: " + decimalFormat.format(area));

        scanner.close();
    }
}
