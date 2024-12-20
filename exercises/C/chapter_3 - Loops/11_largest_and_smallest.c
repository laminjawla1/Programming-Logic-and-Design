// 11. Largest and Smallest
// Design a Python program with a loop that lets the user enter a series of numbers. The user should enter –99 to signal the
// end of the series. After all the numbers have been entered, the program should display the largest and smallest numbers
// entered.
#include <stdio.h>
#include <limits.h>
#include <stdbool.h>

#define END -99


int main(int argc, char const *argv[])
{
    int number, smallest = INT_MAX, largest = INT_MIN;

    while (true)
    {
        printf("Enter a number (enter -99 to finish): ");
        scanf("%d", &number);

        if (number == END)
            break;
        if (smallest > number)
            smallest = number;
        if (largest < number)
            largest = number;
    }
    printf("Smallest: %d\n", smallest);
    printf("Largest: %d\n", largest);
    return 0;
}
