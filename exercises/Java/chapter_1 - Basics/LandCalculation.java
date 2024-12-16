import java.util.Scanner;

//One hectare of land is equivalent to 10,000 square meters. Design a Java program that asks the user to enter the total
//square meters in a tract of land and calculates the number of hectares in the tract.
//Hint: Divide the amount entered by 10,000 to get the number of hectares.
public class LandCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total square meters: ");
        final double totalSquareMeters = scanner.nextDouble();
        final double area = totalSquareMeters / 10000;

        System.out.println("Area in Hectares: " + area);
    }
}
