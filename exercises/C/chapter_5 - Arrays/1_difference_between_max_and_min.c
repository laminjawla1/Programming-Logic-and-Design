// 1. Difference between max and min
// Design a C program that asks the user to create an Array of numbers. The program should ask the user when to stop
// inserting numbers in the list. Then, the program should find the difference between the largest and smallest numbers in
// the list.
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, *array, largest, smallest;

    // Prompt the user for the size of the array
    printf("How many numbers to be read? ");
    scanf("%d", &n);

    // Validate input
    if (n < 1)
    {
        printf("Quitting... The array size must be at least 1.\n");
        return 1;
    }

    // Allocate memory for the array
    array = malloc(sizeof(int) * n);
    if (array == NULL)
    {
        printf("Memory allocation failed. Exiting...\n");
        return 1;
    }

    // Input numbers into the array
    for (int i = 0; i < n; i++)
    {
        printf("Enter number #%d: ", i + 1);
        scanf("%d", &array[i]);
    }

    // Initialize smallest and largest with the first element
    smallest = largest = array[0];

    // Find the smallest and largest values
    for (int i = 1; i < n; i++) // Start from index 1
    {
        if (array[i] < smallest)
            smallest = array[i];
        if (array[i] > largest)
            largest = array[i];
    }

    // Display results
    printf("Smallest: %d\n", smallest);
    printf("Largest: %d\n", largest);
    printf("Difference: %d\n", largest - smallest);

    // Free allocated memory
    free(array);
    return 0;
}
