
// 1. Total of a Series of Numbers
// Design a Python program that asks the user to enter a positive integer number and calculates the total of the following
// series of numbers: 1/n + 2/(n-1) + 3/(n-2) + 4/(n-3) + 5/(n-4) … + n/1
// (Hint, if you enter 4 then the program will calculate the total of 1/4 + 2/3 + 3/2 + 4/1)
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int number;
    double total = 0;

    printf("Enter a positive integer: ");
    scanf("%d", &number);

    for (int i = 1, j = number; i <= number; i++, j--)
    {
        if (i < number)
            printf("%d/%d + ", i, j);
        else
            printf("%d/%d = ", i, j);
        total += (double)(i) / j;
    }
    printf("%.1lf\n", total);
    return 0;
}
