// 3. Land Calculation
// One hectare of land is equivalent to 10,000 square meters. Design a Python program that asks the user to enter the total
// square meters in a tract of land and calculates the number of hectares in the tract.
// Hint: Divide the amount entered by 10,000 to get the number of hectares.
#include <stdio.h>

int main(void)
{
    double total_square_meters;
    double area;
    
    printf("Enter Total Square Meters: ");
    scanf("%lf", &total_square_meters);

    area = total_square_meters / 10000;

    printf("Hectare: %.4lf\n", area);
    return (0);
}