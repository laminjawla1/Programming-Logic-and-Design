// 9. Swap Two Numbers
// Design a Python program that asks the user to enter two numbers. The program should swap the numbers and display.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int first_number, second_number, place_holder;

    printf("Enter first number: ");
    scanf("%d", &first_number);

    printf("Enter second number: ");
    scanf("%d", &second_number);

    place_holder = first_number;
    first_number = second_number;
    second_number = place_holder;

    printf("First Number: %d\n", first_number);
    printf("Second Number: %d\n", second_number);
    return 0;
}
