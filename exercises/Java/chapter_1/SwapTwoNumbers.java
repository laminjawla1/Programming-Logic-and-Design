import java.util.Scanner;

//9. Swap Two Numbers
//Design a Python program that asks the user to enter two numbers. The program should swap the numbers and display.
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();

        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
    }
}
