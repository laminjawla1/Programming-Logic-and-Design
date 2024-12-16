// 5. Distance Traveled
// Assuming there are no accidents or delays, the distance that a car travels down the interstate can be calculated with the
// following formula:

// Distance = Speed × Time

// A car is traveling at 60 miles per hour. Design a Python program that displays the following:
// - The distance the car will travel in 5 hours
// - The distance the car will travel in 8 hours
// - The distance the car will travel in 12 hours
#include <stdio.h>


int main(int argc, char const *argv[])
{
    const double SPEED = 60.0;

    printf("The distance the car will travel in 5 hours: %.4lf\n", SPEED * 5);
    printf("The distance the car will travel in 8 hours: %.4lf\n", SPEED * 8);
    printf("The distance the car will travel in 12 hours: %.4lf\n", SPEED * 12);

    return 0;
}
