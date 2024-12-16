//2. Sales Prediction
//A company has determined that its annual profit
//is typically 23 percent of total sales.
//Design a Python program that asks the user to enter
//the projected amount of total sales,
//and then displays the profit that will be made from that amount.
//Hint: Use the value 0.23 to represent 23 percent.
import java.util.Scanner;
public class SalesPrediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the projected amount of total sales: ");
        double totalSales = scanner.nextFloat();
        double profit = totalSales * 0.23;

        System.out.println("Profit: " + profit);
    }
}
