// 4. Convert a list of characters into a string
// Design a Python program that asks the user to create a list of characters.
// Then, the program should convert it to a string
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define BUFFER_SIZE 1000

void print_list(char *list, size_t size);
char *array_to_string(char *arr, size_t size);

int main()
{
    char *list, *string;
    size_t size = 0;
    char input[BUFFER_SIZE], c;

    // Allocate memory for the list
    list = malloc(sizeof(char) * BUFFER_SIZE);
    if (list == NULL)
    {
        printf("Error: Memory allocation failed.\n");
        return 1;
    }

    // User input loop
    while (1)
    {
        printf("Enter a character (or type 'stop' to finish): ");
        fgets(input, BUFFER_SIZE, stdin);
        input[strcspn(input, "\n")] = '\0'; // Remove newline character

        if (strcmp(input, "stop") == 0)
            break;

        if (strlen(input) != 1)
        {
            printf("Please enter only one character at a time.\n");
            continue;
        }

        // Add character to the list
        c = input[0];
        list[size++] = c;

        // Check for buffer overflow
        if (size >= BUFFER_SIZE)
        {
            printf("Error: Too many characters entered. Exiting.\n");
            free(list);
            return 1;
        }
    }

    // Check if the list is empty
    if (size == 0)
    {
        printf("No characters were entered.\n");
        free(list);
        return 0;
    }

    // Print the list and convert it to a string
    printf("List of characters: ");
    print_list(list, size);

    string = array_to_string(list, size);
    if (string == NULL)
    {
        printf("Error: Memory allocation failed for the string.\n");
        free(list);
        return 1;
    }

    printf("String: %s\n", string);

    // Free allocated memory
    free(string);
    free(list);

    return 0;
}

// Function to print a list
void print_list(char *list, size_t size)
{
    printf("[");
    for (size_t i = 0; i < size; i++)
    {
        if (i > 0)
            printf(", ");
        printf("'%c'", list[i]);
    }
    printf("]\n");
}

// Function to convert an array of characters into a string
char *array_to_string(char *arr, size_t size)
{
    char *string = malloc(size + 1); // Allocate memory for the string (size + 1 for null terminator)
    if (string == NULL)
        return NULL;

    for (size_t i = 0; i < size; i++)
    {
        string[i] = arr[i];
    }
    string[size] = '\0'; // Null-terminate the string
    return string;
}
