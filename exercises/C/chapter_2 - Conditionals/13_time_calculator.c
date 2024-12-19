// 13. Time Calculator
// Design a Python program that asks the user to enter a number of seconds, and works as follows:
// • There are 60 seconds in a minute. If the number of seconds entered by the user is greater than or equal to 60, the
// program should display the number of minutes in that many seconds.
// • There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater than or equal to 3,600,
// the program should display the number of hours in that many seconds.
// • There are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400,
// the program should display the number of days in that many seconds.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    double days, hours, minutes, seconds;

    printf("Enter Seconds: ");
    scanf("%lf", &seconds);

    days = (int)(seconds / 86400);
    seconds = (int) (seconds) % 86400;


    hours = (int)(seconds / 3600);
    seconds = (int)(seconds) % 3600;

    minutes = (int)(seconds / 60);
    seconds = (int)(seconds) % 60;

    printf("DAYS: %.0lf\n", days);
    printf("HOURS: %.0lf\n", hours);
    printf("MINUTES: %.0lf\n", minutes);
    printf("SECONDS: %.0lf\n", seconds);

    return 0;
}
