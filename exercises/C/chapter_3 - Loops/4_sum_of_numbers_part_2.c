// 4. Sum of Numbers – Part2.
// Design a Python program that calculates and prints the sum of cubes of even numbers up to a specified limit (e.g., 20)
// using a while loop.
#include <stdio.h>
#include <math.h>


int main(int argc, char const *argv[])
{
    int limit, sum = 0;

    printf("Enter Limit: ");
    scanf("%d", &limit);

    for (int i = 2; i <= limit; i += 2)
        sum += pow(i, 3);
    printf("Sum of cubes of even numbers: %d\n", sum);
    return (0);
}
