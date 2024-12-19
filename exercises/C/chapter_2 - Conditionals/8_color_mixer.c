// 8. Color Mixer
// The colors red, blue, and yellow are known as the primary colors because they cannot be made by mixing other colors.
// When you mix two primary colors, you get a secondary color, as shown here:
// - When you mix red and blue, you get purple.
// - When you mix red and yellow, you get orange.
// - When you mix blue and yellow, you get green.
// Design a Python program that prompts the user to enter the names of two primary colors to mix. If the user enters
// anything other than “red,” “blue,” or “yellow,” the program should display an error message. Otherwise, the program
// should display the name of the secondary color that results.
#include <stdio.h>
#include <string.h>


int main(int argc, char const *argv[])
{
    char *primary_colors[] = {"red", "blue", "yellow"};
    char *color_one, *color_two;
    int color_1, color_2;

    printf("Choose two colors [1. red, 2. blue, 3.yellow]: ");
    scanf("%d %d", &color_1, &color_2);

    if ((color_1 >= 1 && color_1 <= 3) && (color_2 >= 1 && color_2 <= 3))
    {
        color_one = primary_colors[color_1 - 1];
        color_two = primary_colors[color_2 - 1];
    }
    else
    {
        printf("Invalid options\n");
        return (1);
    }

    switch (color_1)
    {
        case 1:
            if (color_2 == 2)
                printf("%s + %s = %s\n", color_one, color_two, "purple");
            else if (color_2 == 3)
                printf("%s + %s = %s\n", color_one, color_two, "orange");
            else
                printf("%s + %s = %s\n", color_one, color_two, "unknown color");
            break;
        case 2:
            if (color_2 == 1)
                printf("%s + %s = %s\n", color_one, color_two, "purple");
            else if (color_2 == 3)
                printf("%s + %s = %s\n", color_one, color_two, "green");
            else
                printf("%s + %s = %s\n", color_one, color_two, "unknown color");
            break;
        case 3:
            if (color_2 == 1)
                printf("%s + %s = %s\n", color_one, color_two, "orange");
            else if (color_2 == 2)
                printf("%s + %s = %s\n", color_one, color_two, "green");
            else
                printf("%s + %s = %s\n", color_one, color_two, "unknown color");
            break;
        default:
            printf("Invalid colors.\n");
    }
    return 0;
}
