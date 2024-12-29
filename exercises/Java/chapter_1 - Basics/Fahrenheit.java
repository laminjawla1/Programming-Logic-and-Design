import java.util.Scanner;

//10. Celsius to Fahrenheit Temperature Converter
//Design a Python program that converts Celsius temperatures to Fahrenheit temperatures.
//The formula is as follows:
//
//F = (9/5)C + 32
//
//The program should ask the user to enter a temperature in Celsius, and then display the temperature converted to
//Fahrenheit.
public class Fahrenheit {
    public static void main(String[] args) {
        float celsius;
        float fahrenheit;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        celsius = input.nextFloat();

        fahrenheit = (float) ((9.0/5.0) * celsius + 32);

        System.out.println("Temperature in fahrenheit: " + fahrenheit);
        input.close();
    }
}
