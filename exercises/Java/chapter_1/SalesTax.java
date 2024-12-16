import java.util.Scanner;

//6. Sales Tax
//Design a Java program that will ask the user to enter the amount of a purchase. The program should then compute
//the VAT tax. The program should display the amount of the purchase, the VAT tax, and the total of the sale (which is the
//sum of the amount of purchase plus the VAT tax).
//Hint: Use the value 0.15 to represent 15%.
public class SalesTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of a purchase: ");
        float purchaseAmount = scanner.nextFloat();
        float vatTax = 0.15f * purchaseAmount;
        float total = purchaseAmount + vatTax;

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Vat Tax: " + vatTax);
        System.out.println("Total: " + total);
    }
}
