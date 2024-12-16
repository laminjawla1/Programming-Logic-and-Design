import java.util.Scanner;

//8. Area of a Trapezoid
//Design a Java program that will ask the user to enter the two bases of a trapezoid and height. The program should
//computer the area and display the result. (Hint: area of the trapezoid is 1⁄2 *(base1 + base2)*height)
public class TrapezoidArea {
    public static void main(String[] args) {
        float baseOne;
        float baseTwo;
        float height;
        float area;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base 1: ");
        baseOne = scanner.nextFloat();

        System.out.print("Enter base 2: ");
        baseTwo = scanner.nextFloat();

        System.out.print("Enter height: ");
        height = scanner.nextFloat();

        area = 0.5f * (baseOne + baseTwo) * height;

        System.out.println("Area: " + area);
    }
}
