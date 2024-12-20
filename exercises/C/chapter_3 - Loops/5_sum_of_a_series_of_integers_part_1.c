// 5. Sum of a Series of Integers - Part1.
// Design a Python program to calculate the sum of the series (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n). The output
// should look like:
// 1*1 = 1
// 2*2 = 4
// 3*3 = 9
// …
// The sum of the above series is:
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int n, sum = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        sum += i * i;
        printf("%d * %d = %d\n", i, i, i * i);
    }
    printf("The sum of the above series is: %d\n", sum);
    return 0;
}
