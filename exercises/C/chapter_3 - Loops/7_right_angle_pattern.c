// 7. Right Angle Pattern
// Design a Python program that makes a pattern such as a right-angle triangle using numbers that repeat.
// 1
// 22
// 333
// 4444
// 55555
// …
// nnnnn
// """
#include <stdio.h>


int main(int argc, char const *argv[])
{
    int height;

    printf("Enter Height: ");
    scanf("%d", &height);

    for (int row = 1; row <= height; row++)
    {
        for (int column = 1; column <= row; column++)
            printf("%d", row);
        putchar('\n');
    }
    return 0;
}
