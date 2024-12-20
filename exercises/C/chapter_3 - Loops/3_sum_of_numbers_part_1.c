// 3. Sum of Numbers – Part1.
// Design a Python program with a loop that asks the user to enter a series of positive numbers. The user should enter a
// negative number to signal the end of the series. After all the positive numbers have been entered, the program should
// display their sum.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int number, total = 0;

    printf("Enter a number (Negative number to halt): ");
    scanf("%d", &number);
    
    while (number >= 0)
    {
        total += number;
        printf("Enter a number (Negative number to halt): ");
        scanf("%d", &number);
    }

    printf("Sum: %d\n", total);
    
    return 0;
}
