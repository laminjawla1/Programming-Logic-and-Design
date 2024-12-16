// 2. Sales Prediction
// A company has determined that its annual profit
// is typically 23 percent of total sales.
// Design a Python program that asks the user to enter
// the projected amount of total sales,
// and then displays the profit that will be made from that amount.
// Hint: Use the value 0.23 to represent 23 percent.
#include <stdio.h>

int main(void)
{
    double total_sales;
    double profit;
    
    printf("Enter total sales: ");
    scanf("%lf", &total_sales);

    profit = 0.23 * total_sales;
    printf("Profit: %.2lf\n", profit);

    return (0);
}