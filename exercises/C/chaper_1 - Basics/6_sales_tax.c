// 6. Sales Tax
// Design a Python program that will ask the user to enter the amount of a purchase. The program should then compute
// the VAT tax. The program should display the amount of the purchase, the VAT tax, and the total of the sale (which is the
// sum of the amount of purchase plus the VAT tax).
// Hint: Use the value 0.15 to represent 15%.
#include <stdio.h>


int main(void)
{
    double amount_of_a_purchase;
    double vat_tax;
    double total_sale;

    printf("Enter total of a purchase: ");
    scanf("%lf", &amount_of_a_purchase);

    vat_tax = 0.15 * amount_of_a_purchase;
    total_sale = vat_tax + amount_of_a_purchase;

    printf("Total Purchase: %.2lf\n", amount_of_a_purchase);
    printf("Vat Tax: %.2lf\n", vat_tax);
    printf("Total Sale: %.2lf\n", total_sale);
}