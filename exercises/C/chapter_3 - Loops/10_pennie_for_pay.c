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
    double total_pay;

    printf("Enter number of days: ");
    scanf("%d", &days);

    total_pay = pow(2, days) / 100;
    printf("Total Pay: %.2lf\n", total_pay);
    return 0;
}
