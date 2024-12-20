// 8. Tuition Increase
// At one college, the tuition for a full-time student is $6,000 per semester. It has been announced that the tuition will
// increase by 2 percent each year for the next five years. Design a Python program with a loop that displays the projected
// semester tuition amount for the next five years.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    double tuition_fee = 6000.00;

    for (int year = 1; year <= 5; year++)
    {
        tuition_fee += 0.02 * tuition_fee;
        printf("Year %d Tuition Fee: $%.2lf\n", year, tuition_fee);
    }
    return 0;
}
