// 5. Interchange numbers
// Design a Python program that ask the user to create an even number list of digits. Then, the program should swap the
// first digit with the last digit, 2nd digit with the before last digit …etc.
#include <stdio.h>
#include <stdlib.h>

// Function prototypes
int *create_int_list(size_t size);
void print_list(int *list, size_t size);
void interchange(int *list, size_t size);
void swap(int *list, size_t i, size_t j);

int main()
{
    int *list;
    size_t size;

    // Input the size of the list
    printf("Enter the size of the list (must be a positive even number): ");
    scanf("%lu", &size);

    // Validate size
    if (size <= 0 || size % 2 != 0)
    {
        printf("Error: Size must be a positive even number.\n");
        return 1;
    }

    // Create the list
    list = create_int_list(size);
    if (list == NULL)
    {
        printf("Error: Memory allocation failed.\n");
        return 1;
    }

    // Print the original list
    printf("Original List: ");
    print_list(list, size);

    // Interchange the elements
    interchange(list, size);

    // Print the modified list
    printf("Interchanged List: ");
    print_list(list, size);

    // Free allocated memory
    free(list);
    return 0;
}

// Function to create a list of integers from user input
int *create_int_list(size_t size)
{
    int *list = malloc(sizeof(int) * size);
    if (list == NULL)
        return NULL;

    for (size_t i = 0; i < size; i++)
    {
        printf("Enter element #%lu: ", i + 1);
        scanf("%d", &list[i]);
    }
    return list;
}

// Function to print a list of integers
void print_list(int *list, size_t size)
{
    printf("[");
    for (size_t i = 0; i < size; i++)
    {
        if (i > 0)
            printf(", ");
        printf("%d", list[i]);
    }
    printf("]\n");
}

// Function to interchange elements in the list
void interchange(int *list, size_t size)
{
    for (size_t start = 0, end = size - 1; start < end; start++, end--)
        swap(list, start, end);
}

// Function to swap two elements in the list
void swap(int *list, size_t i, size_t j)
{
    int temp = list[i];
    list[i] = list[j];
    list[j] = temp;
}
