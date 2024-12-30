// 10. Pennies for Pay
// Design a Python program that calculates the amount of money a person would earn over a period of time if his or her
// salary is one penny the first day, two pennies the second day, and continues to double each day. The program should ask
// the user for the number of days. Display the total pay at the end of the period. The output should be displayed in a dollar
// amount, not the number of pennies.
#include <stdio.h>
#include <math.h>


int main(int argc, char const *argv[])
{
    int days;
    double daily_pay = 1;
    double total_pay_in_pennies;
    double total_pay_in_dollars;

    printf("Enter number of days: ");
    scanf("%d", &days);

    if (days <= 0)
    {
        printf("The number of days must be greater than zero.");
        return (1);
    }

    for (int i = 1; i <= days; i++)
    {
        total_pay_in_pennies += daily_pay;
        daily_pay *= 2;
    }
    total_pay_in_dollars = total_pay_in_pennies / 100;
    printf("Total Pay %d days is %.2lf\n", days, total_pay_in_dollars);
    return 0;
}
