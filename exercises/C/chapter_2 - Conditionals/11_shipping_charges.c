// 11. Shipping Charges

// The Fast Freight Shipping Company charges the following rates:
// Weight of Package                           Rate per Pound
// 2 pounds or less                            $1.10
// Over 2 pounds but not more than 6 pounds    $2.20
// Over 6 pounds but not more than 10 pounds   $3.70
// Over 10 pounds                              $3.80
// Design a Python program that asks the user to enter the weight of a package and then displays the shipping charges.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    double weight, charges;

    printf("Enter the weight of a package: ");
    scanf("%lf", &weight);

    if (weight > 10)
        charges = 3.80;
    else if (weight > 6 && weight <= 10)
        charges = 3.70;
    else if (charges > 2 && weight <= 6)
        charges = 2.20;
    else
        charges = 1.10;
    
    printf("Shipping Charges: %.2lf\n", charges);
    return 0;
}
