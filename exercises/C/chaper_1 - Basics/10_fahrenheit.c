// 10. Celsius to Fahrenheit Temperature Converter
// Design a Python program that converts Celsius temperatures to Fahrenheit temperatures.
// The formula is as follows:

// F = (9/5)C + 32

// The program should ask the user to enter a temperature in Celsius, and then display the temperature converted to
// Fahrenheit.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    double celsius, fahrenheit;

    printf("Enter temperature in celsius: ");
    scanf("%lf", &celsius);

    fahrenheit = (9.0/5.0) * celsius + 32;

    printf("Temperature in Fahrenheit: %.1lf\n", fahrenheit);
    return 0;
}

