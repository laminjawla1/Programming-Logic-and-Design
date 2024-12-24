// 2. Common elements in two lists
// Design a Python program that asks the user to create two lists of numbers of any sizes . Then, the program should find
// the common elements between the two lists.
#include <stdio.h>
#include <stdlib.h>

// Function prototypes
int *create_list(size_t size);
void print_list(int *list, size_t size);
int list_has(int *list, size_t size, int number);

int main()
{
    size_t size_1, size_2, intersection_index = 0;
    int *list_1, *list_2, *intersection;

    // Input size for list 1
    printf("What's the size for list 1: ");
    scanf("%lu", &size_1);
    list_1 = create_list(size_1);
    if (list_1 == NULL)
    {
        printf("Quitting! Memory allocation failed for list 1.\n");
        return 1;
    }

    // Input size for list 2
    printf("What's the size for list 2: ");
    scanf("%lu", &size_2);
    list_2 = create_list(size_2);
    if (list_2 == NULL)
    {
        printf("Quitting! Memory allocation failed for list 2.\n");
        free(list_1);
        return 1;
    }

    // Allocate initial memory for the intersection array
    intersection = malloc(sizeof(int) * (size_1 < size_2 ? size_1 : size_2));
    if (intersection == NULL)
    {
        printf("Error: Failed to allocate memory for the intersection.\n");
        free(list_1);
        free(list_2);
        return 1;
    }

    // Find the intersection
    for (size_t i = 0; i < size_2; i++)
    {
        if (list_has(list_1, size_1, list_2[i]) && !list_has(intersection, intersection_index, list_2[i]))
        {
            intersection[intersection_index++] = list_2[i];
        }
    }

    // Print the intersection
    printf("Intersection: ");
    print_list(intersection, intersection_index);

    // Free memory
    free(list_1);
    free(list_2);
    free(intersection);
    return 0;
}

// Function to create a list with user input
int *create_list(size_t size)
{
    int *list = malloc(sizeof(int) * size);
    if (list == NULL)
        return NULL;

    for (size_t i = 0; i < size; i++)
    {
        printf("Enter Element #%lu: ", i + 1);
        scanf("%d", &list[i]);
    }
    return list;
}

// Function to check if a number exists in a list
int list_has(int *list, size_t size, int number)
{
    for (size_t i = 0; i < size; i++)
    {
        if (number == list[i])
            return 1;
    }
    return 0;
}

// Function to print a list
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
