// 6. Sum of a Series of Integers – Part2.
// Design a Python program to calculate the series (1) + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n). The output
// should look like:
// 1=1
// 1+2 = 3
// 1+2+3 = 6
// …
// The sum of the above series is:
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int number, row_total, table_total = 0;

    printf("Enter a number: ");
    scanf("%d", &number);

    for (int i = 1; i <= number; i++)
    {
        row_total = 0;
        for (int j = 1; j <= i; j++)
        {
            (j < i) ? printf("%d + ", j) : printf("%d ", j);
            row_total += j;
        }
        printf("= %d\n", row_total);
        table_total += row_total;
    }
    printf("The sum of the above series is: %d\n", table_total);
    return 0;
}
