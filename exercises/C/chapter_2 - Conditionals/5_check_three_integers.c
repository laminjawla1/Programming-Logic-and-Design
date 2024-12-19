// 5. Check Three Integers
// Design a Python program to check the largest number among three given integers.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int first_number, second_number, third_number, largest;

    printf("Enter three numbers (separated by a space): ");
    scanf("%d %d %d", &first_number, &second_number, &third_number);

    largest = first_number;
    if (largest < second_number)
        largest = second_number;
    if (largest < third_number)
        largest  = third_number;

    printf("Largest: %d\n", largest);

    return 0;
}
