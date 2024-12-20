// 9. Series of Integers
// Design a Python program to read a series of integers. The first integer is special, as it indicates how many more integers
// will follow. The output of the program will be the calculated the sum and average of the integers [excluding the first
// integer].
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int n, number, sum = 0;
    double avg;

    printf("How many numbers to be entered? ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        printf("Enter a number: ");
        scanf("%d", &number);

        sum += number;
    }

    if (n > 0)
    {
        avg = sum / n;
        printf("%d numbers read.\n", n);
        printf("Sum: %d\n", sum);
        printf("Average: %.1lf\n", avg);
    }
    else
        printf("Input Stream Closed!!!\n");
    return 0;
}
