// 2. Reverse a string
// Design a Python program that will ask the user to enter a string. The program will reverse and display the string.
#include <stdio.h>
#include <string.h>

#define BUFF_LEN 50

int main(int argc, char const *argv[])
{
    char string[BUFF_LEN];

    printf("Enter a string: ");
    fgets(string, BUFF_LEN, stdin);
    string[strcspn(string, "\n")] = '\0'; // Remove newline character

    int len = strlen(string);

    // Reverse string
    for (int i = 0; i < len / 2; i++)
    {
        char temp = string[i];
        string[i] = string[len - i - 1];
        string[len - i - 1] = temp;
    }

    printf("Reverse: %s\n", string);
    return 0;
}
