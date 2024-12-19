// 10. Software Sales
// A software company sells a package that retails for $99. Quantity discounts are given according to the following table:
// Quantity    Discount
// 10 - 19     20%
// 20 - 49     30%
// 50 - 99     40%
// >= 100      50%
// Design a Python program that asks the user to enter the number of packages purchased.
// The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount.
#include <stdio.h>
#include <stdbool.h>


int main(int argc, char const *argv[])
{
    int packages_purchase;
    double discount_percent;
    double unit_price;
    double total_amount;
    double discount_amount;
    double total_amount_after_discount;
    bool error_occurred;

    printf("Enter the number of packages purchased: ");
    scanf("%d", &packages_purchase);

    if (packages_purchase >= 10 && packages_purchase <= 19) 
        discount_percent = 0.2;
    else if (packages_purchase >= 20 && packages_purchase <= 49)
        discount_percent = 0.3;
    else if (packages_purchase >= 50 && packages_purchase <= 99)
        discount_percent = 0.4;
    else if (packages_purchase >= 100)
        discount_percent = 0.5;
    else
        error_occurred = true;
    
    if (!error_occurred)
    {
        unit_price = 99;
        total_amount = unit_price * packages_purchase;
        discount_amount = discount_percent * total_amount;
        total_amount_after_discount = total_amount - discount_amount;
        printf("Discount Percent: %.0lf%%\n", discount_percent * 100);
        printf("Discount Amount: %.2lf\n", discount_amount);
        printf("Total Amount: %.2lf\n", total_amount);
        printf("Total Amount After Discount: %.2lf\n", total_amount_after_discount);
    }
    else
        printf("Error: Invalid number of packages purchased.\n");


    return 0;
}
