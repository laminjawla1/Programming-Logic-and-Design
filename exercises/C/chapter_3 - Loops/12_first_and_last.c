// 12. First and Last
// Design a Python program that asks the user for a series of names (in no particular order). After the final person’s name
// has been entered, the program should display the name that is first alphabetically and the name that is last
// alphabetically. For example, if the user enters the names Kristin, Joel, Adam, Beth, Zeb, and Chris, the program will
// display Adam and Zeb.
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    int number_of_names;
    char **names;
    char *first, *last;

    printf("How many names to be entered? ");
    scanf("%d", &number_of_names);
    getchar(); // To consume the newline character after scanf

    // Dynamically allocate memory for storing names
    names = malloc(number_of_names * sizeof(char *));
    if (names == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    // Read names
    for (int i = 0; i < number_of_names; i++) {
        names[i] = malloc(50 * sizeof(char)); // Allocate space for each name
        if (names[i] == NULL) {
            printf("Memory allocation failed.\n");
            return 1;
        }

        printf("Enter name #%d: ", i + 1);
        fgets(names[i], 50, stdin);
        names[i][strcspn(names[i], "\n")] = '\0'; // Remove the trailing newline character
    }

    // Initialize first and last to the first name in the list
    first = names[0];
    last = names[0];

    // Compare to find the first and last names alphabetically
    for (int i = 1; i < number_of_names; i++) {
        if (strcmp(first, names[i]) > 0)
            first = names[i];
        if (strcmp(last, names[i]) < 0)
            last = names[i];
    }

    printf("First: %s\n", first);
    printf("Last: %s\n", last);

    // Free allocated memory
    for (int i = 0; i < number_of_names; i++) {
        free(names[i]);
    }
    free(names);

    return 0;
}

