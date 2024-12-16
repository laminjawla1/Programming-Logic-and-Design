// 7. Area of a Circle
// Design a Python program that will ask the user to enter the radius of a circle. The program should then compute the area
// of the circle and display the result. (Hint: area of the circle is pi*r2)
#include <stdio.h>


int main(int argc, char const *argv[])
{
    double radius, area;

    printf("Enter radius: ");
    scanf("%lf", &radius);

    area = 3.1415 * radius * radius;

    printf("Area: %.4lf\n", area);

    return 0;
}
