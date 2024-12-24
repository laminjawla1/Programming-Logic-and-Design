// 3. Sum and product of numbers
// Design a Python program that asks the user to create a list of numbers. Then, the program should find the sum and
// product of numbers with odd indices.
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define BUFFER_SIZE 1000

bool is_number(const char *str);
void print_list(int *list, size_t size);

int main()
{
    int *list;
    size_t size = 0;
    char input[BUFFER_SIZE];
    long n, sum = 0, product = 1;

    // Allocate memory for the list
    list = malloc(sizeof(int) * BUFFER_SIZE);
    if (list == NULL)
    {
        printf("Error: Memory allocation failed.\n");
        return 1;
    }

    // User input loop
    while (true)
    {
        printf("Enter a number (or type 'stop' to finish): ");
        fgets(input, BUFFER_SIZE, stdin);
        input[strcspn(input, "\n")] = '\0'; // Remove newline character

        if (strcmp(input, "stop") == 0)
            break;

        if (!is_number(input))
        {
            printf("Invalid input! Please enter a valid number.\n");
            continue;
        }

        // Convert input to a number and add to the list
        n = atol(input);
        list[size++] = n;

        // Check for buffer overflow
        if (size >= BUFFER_SIZE)
        {
            printf("Error: Too many numbers entered. Exiting.\n");
            free(list);
            return 1;
        }
    }

    // Check if the list is empty
    if (size == 0)
    {
        printf("No numbers were entered.\n");
        free(list);
        return 0;
    }


    // Print the list
    printf("List of numbers: ");
    print_list(list, size);

    // Calculate the sum and product of numbers with odd indices
    for (size_t i = 1; i < size; i += 2)
    {
        sum += list[i];
        product *= list[i];
    }

    printf("Sum of numbers at odd indices: %ld\n", sum);
    printf("Product of numbers at odd indices: %ld\n", product);

    // Free allocated memory
    free(list);

    return 0;
}

// Function to check if a string is a valid number
bool is_number(const char *str)
{
    if (*str == '\0') // Empty string
        return false;

    // Allow negative numbers
    if (*str == '-')
        str++;

    while (*str)
    {
        if (!isdigit(*str))
            return false;
        str++;
    }

    return true;
}

// Function to print a list
void print_list(int *list, size_t size)
{
    printf("[");
    for (size_t i = 0; i < size; i++)
    {
        if (i > 0)
            printf(", ");
        printf("%d", list[i]);
    }
    printf("]\n");
}
