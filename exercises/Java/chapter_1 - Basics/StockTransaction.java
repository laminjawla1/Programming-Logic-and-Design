//11. Stock Transaction Program
//Last month Joe purchased some stock in Acme Software, Inc. Here are the details of the purchase:
//        • The number of shares that Joe purchased was 1,000.
//        • When Joe purchased the stock, he paid $32.87 per share.
//        • Joe paid his stockbroker a commission that amounted to 2 percent of the amount he paid for the stock.
//Two weeks later Joe sold the stock. Here are the details of the sale:
//        • The number of shares that Joe sold was 1,000.
//        • He sold the stock for $33.92 per share.
//        • He paid his stockbroker another commission that amounted to 2 percent of the amount he received for the stock.
//Design a Python program that displays the following information:
//        • The amount of money Joe paid for the stock.
//        • The amount of commission Joe paid his broker when he bought the stock.
//• The amount that Joe sold the stock for.
//        • The amount of commission Joe paid his broker when he sold the stock.
//• Did Joe make money or lose money? Display the amount of profit or loss after Joe sold the stock and paid his broker
//        (both times).
public class StockTransaction {
    public static void main(String[] args) {
        // Last month Joe purchased some stock in Acme Software, Inc.
        // Here are the details of the purchase:
        int sharesPurchased = 1000;
        double purchaseUnitPrice = 32.87;
        double purchaseTotal = sharesPurchased * purchaseUnitPrice;
        double commissionAtPurchase = 0.02 * purchaseTotal;
        double purchaseActualTotal = purchaseTotal + commissionAtPurchase;

        //Two weeks later Joe sold the stock.
        // Here are the details of the sale:
        int sharesSold = 1000;
        double saleUnitPrice = 33.92;
        double saleTotal = sharesSold * saleUnitPrice;
        double commissionAtSale = 0.02 * saleTotal;
        double saleActualTotal = saleTotal - commissionAtSale;

        System.out.println("The amount of money Joe paid for the stock: " + purchaseActualTotal);
        System.out.println("The amount of commission Joe paid his broker when he bought the stock: " + commissionAtPurchase);
        System.out.println("The amount that Joe sold the stock for: " + saleActualTotal);
        System.out.println("The amount of commission Joe paid his broker when he sold the stock: " + commissionAtSale);
        System.out.println("Profit: " + (saleActualTotal - purchaseActualTotal));
    }
}
