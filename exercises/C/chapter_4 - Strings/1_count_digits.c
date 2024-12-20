// 1. Count digits in a string

// Design a Python program that will ask the user to enter a string.
// The program will count the sum of all digits in the string.
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define BUFFER_LEN 1000

int main(int argc, char const *argv[])
{
    char string[BUFFER_LEN];
    int digit_count = 0;
    int sum = 0;

    printf("Enter a string: ");
    fgets(string, BUFFER_LEN, stdin);
    string[strcspn(string, "\n")] = '\0'; // Remove trailing newline

    for (int i = 0, len = strlen(string); i < len; i++)
    {
        if (string[i] >= '0' && string[i] <= '9') // Check if character is a digit
        {
            int digit = string[i] - '0'; // Convert character to integer
            sum += digit;
            digit_count++;
        }
    }

    printf("%d digits found.\n", digit_count);
    printf("Sum: %d\n", sum);

    return 0;
}
