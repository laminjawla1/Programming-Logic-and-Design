// 4. Check Two Integers – Part2
// Design a Python program to check a given integer and return true if it is within 10 of 100 or 10 of 200.

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int number;
    
    printf("Enter a number: ");
    scanf("%d", &number);

    if ((number >= 90 && number <= 110) || (number >= 190 && number <= 210))
        printf("True\n");
    else
        printf("False\n");
    return 0;
}
