// 3. Remove non alphabet characters
// Design a Python program that will ask the user to enter a string. The program will remove all non-alphabet characters
// (digits and symbols) and display the result.
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

#define BUF_LEN 50

int main(int argc, char const *argv[])
{
    char string[BUF_LEN], *filtered_string;
    int index = 0, length;

    printf("Enter a string: ");
    fgets(string, BUF_LEN, stdin);
    string[strcspn(string, "\n")] = '\0'; // Remove newline

    length = strlen(string);
    filtered_string = malloc(sizeof(char) * (length + 1)); // Allocate memory
    if (filtered_string == NULL)
    {
        printf("Memory Allocation Failed.\n");
        return 1;
    }

    for (int i = 0; i < length; i++)
    {
        if (isalpha(string[i])) // Keep only alphabetic characters
        {
            filtered_string[index++] = string[i];
        }
    }
    filtered_string[index] = '\0'; // Null-terminate the filtered string

    printf("Filtered String: %s\n", filtered_string);

    free(filtered_string); // Free allocated memory
    return 0;
}
