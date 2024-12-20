// 2. Calories Burned
// Running on a particular treadmill you burn 3.9 calories per minute. Design a Python program that uses a loop to display
// the number of calories burned after 10, 15, 20, 25, and 30 minutes.
#include <stdio.h>


int main(int argc, char const *argv[])
{
    for (int minutes = 10; minutes < 35; minutes += 5)
    {
        double calories_burned = minutes * 3.9;
        printf("%.1lf calories burned in %d minutes.\n", calories_burned, minutes);
    }
    return 0;
}
