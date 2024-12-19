// 2. Areas of Rectangles
// The area of a rectangle is the rectangle's length times its width.
// Design a Python program that asks for the length and width of two rectangles.
// The program should tell the user which rectangle has the greater area, or whether the areas are the same.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    double length;
    double width;
    double area_1;
    double area_2;

    printf("Enter length 1: ");
    scanf("%lf", &length);
    printf("Enter width 1: ");
    scanf("%lf", & width);

    area_1 = length * width;

    printf("Enter length 2: ");
    scanf("%lf", &length);
    printf("Enter width 2: ");
    scanf("%lf", & width);

    area_2 = length * width;

    if (area_1 > area_2)
        printf("Rectangle 1 is greater.\n");
    else if (area_2 > area_1)
        printf("Rectangle 2 is greater.\n");
    else
        printf("Both rectangles are same.\n");

    return 0;
}
