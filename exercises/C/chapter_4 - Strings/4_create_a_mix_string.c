// 4. Create a mix string
// Design a Python program that will ask the user to enter three strings. The program will check the length of each string
// and use the length of the shortest as reference. Then the program will create and display a fourth string with the first
// character from each string, followed by the second character from each string till reaching the reference length.
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define BUFF_LEN 50

int main(int argc, char const *argv[])
{
    char string_1[BUFF_LEN], string_2[BUFF_LEN], string_3[BUFF_LEN], *mixed_string;

    // Input strings
    printf("Enter String 1: ");
    fgets(string_1, BUFF_LEN, stdin);
    string_1[strcspn(string_1, "\n")] = '\0';

    printf("Enter String 2: ");
    fgets(string_2, BUFF_LEN, stdin);
    string_2[strcspn(string_2, "\n")] = '\0';

    printf("Enter String 3: ");
    fgets(string_3, BUFF_LEN, stdin);
    string_3[strcspn(string_3, "\n")] = '\0';

    // Find the reference length (shortest string)
    size_t reference = strlen(string_1);
    if (reference > strlen(string_2))
        reference = strlen(string_2);
    if (reference > strlen(string_3))
        reference = strlen(string_3);

    // Allocate memory for the mixed string
    mixed_string = malloc(sizeof(char) * (3 * reference + 1)); // 3 chars per index + null terminator
    if (mixed_string == NULL)
    {
        printf("Memory Allocation Failed.\n");
        return 1;
    }

    // Create the mixed string
    int mixed_string_index = 0;
    for (size_t i = 0; i < reference; i++)
    {
        mixed_string[mixed_string_index++] = string_1[i];
        mixed_string[mixed_string_index++] = string_2[i];
        mixed_string[mixed_string_index++] = string_3[i];
    }
    mixed_string[mixed_string_index] = '\0'; // Null-terminate the string

    // Output the result
    printf("Mixed String: %s\n", mixed_string);

    // Free allocated memory
    free(mixed_string);
    return 0;
}
