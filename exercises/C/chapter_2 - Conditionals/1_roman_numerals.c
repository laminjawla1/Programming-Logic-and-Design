// 1. Roman Numerals

// Design a Python program that prompts the user to enter a number within the range of through 10.
// The program should display the Roman numeral version of that number.
// If the number is outside the range of 1 through 10, the program should display an error message.
#include <stdio.h>

int main(int argc, char const *argv[])
{
    int number;

    printf("Enter a number: ");
    scanf("%d", &number);

    switch(number)
    {
        case 1:
            printf("I\n");
            break;
        case 2:
            printf("II\n");
            break;
        case 3:
            printf("III\n");
            break;
        case 4:
            printf("IV\n");
            break;
        case 5:
            printf("V\n");
            break;
        case 6:
            printf("VI\n");
            break;
        case 7:
            printf("VII\n");
            break;
        case 8:
            printf("VIII\n");
            break;
        case 9:
            printf("IX\n");
            break;
        case 10:
            printf("IX\n");
            break;
        default:
            printf("Invalid Number\n");
    }

    return 0;
}
