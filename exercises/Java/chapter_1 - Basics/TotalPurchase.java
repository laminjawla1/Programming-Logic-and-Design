//4. Total Purchase
//A customer in a store is purchasing five items. Design a Java program that asks for the price of each item, and then
//displays the subtotal of the sale, the amount of sales tax, and the total. Assume the sales tax is 6 percent.

import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price for item 1: ");
        final float itemOnePrice = scanner.nextFloat();

        System.out.print("Enter price for item 2: ");
        final float itemTwoPrice = scanner.nextFloat();

        System.out.print("Enter price for item 3: ");
        final float itemThreePrice = scanner.nextFloat();

        System.out.print("Enter price for item 4: ");
        final float itemFourPrice = scanner.nextFloat();

        System.out.print("Enter price for item 5: ");
        final float itemFivePrice = scanner.nextFloat();

        final float subTotal = itemOnePrice + itemTwoPrice + itemThreePrice + itemFourPrice + itemFivePrice;
        final float salesTax = subTotal * 0.06f;
        final float total = subTotal + salesTax;

        System.out.println("Subtotal: " + subTotal);
        System.out.println("Sales Tax: " + salesTax);
        System.out.println("Total: " + total);
    }
}
