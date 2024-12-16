// 8. Area of a Trapezoid
// Design a Python program that will ask the user to enter the two bases of a trapezoid and height. The program should
// computer the area and display the result. (Hint: area of the trapezoid is 1 / 2 *(base1 + base2)*height)
#include <stdio.h>


int main(int argc, char const *argv[])
{
    double base_1;
    double base_2;
    double height;
    double area;

    printf("Enter base 1: ");
    scanf("%lf", &base_1);

    printf("Enter base 2: ");
    scanf("%lf", &base_2);

    printf("Enter height: ");
    scanf("%lf", &height);

    area = 0.5 * (base_1 + base_2) * height;

    printf("Area: %.4lf\n", area);
    
    return 0;
}
