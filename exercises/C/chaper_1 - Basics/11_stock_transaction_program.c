// 11. Stock Transaction Program
// Last month Joe purchased some stock in Acme Software, Inc. Here are the details of the purchase:
// • The number of shares that Joe purchased was 1,000.
// • When Joe purchased the stock, he paid $32.87 per share.
// • Joe paid his stockbroker a commission that amounted to 2 percent of the amount he paid for the stock.
// Two weeks later Joe sold the stock. Here are the details of the sale:
// • The number of shares that Joe sold was 1,000.
// • He sold the stock for $33.92 per share.
// • He paid his stockbroker another commission that amounted to 2 percent of the amount he received for the stock.
// Design a Python program that displays the following information:
// • The amount of money Joe paid for the stock.
// • The amount of commission Joe paid his broker when he bought the stock.
// • The amount that Joe sold the stock for.
// • The amount of commission Joe paid his broker when he sold the stock.
// • Did Joe make money or lose money? Display the amount of profit or loss after Joe sold the stock and paid his broker
// (both times).
#include <stdio.h>


int main(int argc, char const *argv[])
{
    // Purchase details
    int shares_purchased = 1000;
    double purchased_unit_price = 32.87;
    double total_purchase = shares_purchased * purchased_unit_price;
    double commission_at_purchase = 0.02 * total_purchase;
    double actual_total_purchase = total_purchase + commission_at_purchase;

    // Sale details
    int shares_sold = 1000;
    double sale_unit_price = 33.92;
    double total_sale = shares_sold * sale_unit_price;
    double commission_at_sale = 0.02 * total_sale;
    double actual_total_sale = total_sale - commission_at_sale;

    // Display result
    printf("The amount of money Joe paid for the stock: %.2lf\n", actual_total_purchase);
    printf("The amount of commission Joe paid his broker when he bought the stock: %.2lf\n", commission_at_purchase);
    printf("The amount that Joe sold the stock for: %.2lf\n", actual_total_sale);
    printf("The amount of commission Joe paid his broker when he sold the stock: %.2lf\n", commission_at_sale);
    printf("Did Joe make money or lose money? %.2lf\n", actual_total_sale - actual_total_purchase);

    return 0;
}
