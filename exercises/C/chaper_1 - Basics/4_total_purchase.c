// 4. Total Purchase
// A customer in a store is purchasing five items. Design a Python program that asks for the price of each item, and then
// displays the subtotal of the sale, the amount of sales tax, and the total. Assume the sales tax is 6 percent.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    double item_one_price;
    double item_two_price;
    double item_three_price;
    double item_four_price;
    double item_five_price;
    double subtotal;
    double sales_tax;
    double total;

    printf("Enter price for item one: ");
    scanf("%lf", &item_one_price);

    printf("Enter price for item two: ");
    scanf("%lf", &item_two_price);

    printf("Enter price for item three: ");
    scanf("%lf", &item_three_price);

    printf("Enter price for item four: ");
    scanf("%lf", &item_four_price);

    printf("Enter price for item five: ");
    scanf("%lf", &item_five_price);

    subtotal = item_one_price + item_two_price + item_three_price + item_four_price + item_five_price;
    sales_tax = 0.06 * subtotal;
    total = subtotal + sales_tax;

    printf("Subtotal: %.2lf\n", subtotal);
    printf("Sales Tax: %.2lf\n", sales_tax);
    printf("Total: %.2lf\n", total);
    
    return 0;
}
