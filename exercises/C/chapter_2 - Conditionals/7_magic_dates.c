// 7. Magic Dates
// The date June 10, 1960, is special because when it is written in the following format, the month times the day equals the
// year:
// 6/10/60
// Design a Python program that asks the user to enter a month (in numeric form), a day, and a two-digit year. The program
// should then determine whether the month times the day equals the year. If so, it should display a message saying the
// date is magic. Otherwise, it should display a message saying the date is not magic.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int day, month, two_digit_year;

    printf("Enter day, month and a two digit year (Separated with spaces): ");
    scanf("%d %d %d", &day, &month, &two_digit_year);

    if (day * month == two_digit_year)
        printf("The date is magic\n");
    else
        printf("The date is not magic\n");
    return 0;
}
