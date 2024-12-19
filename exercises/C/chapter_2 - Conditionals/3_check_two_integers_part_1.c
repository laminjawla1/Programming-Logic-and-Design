// 3. Check Two Integers – Part1
// Design a Python program to check two given integers and return true if one of them is 30 or if their sum is 30.
#include <stdio.h>

int main(int argc, char const *argv[])
{
    int first_number, second_number;

    printf("Enter first number: ");
    scanf("%d", &first_number);

    printf("Enter second number: ");
    scanf("%d", &second_number);

    if ((first_number == 30 || second_number == 30) || (first_number + second_number == 30))
        printf("True\n");
    else
        printf("False\n");

    return 0;
}
