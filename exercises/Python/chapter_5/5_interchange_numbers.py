"""
5. Interchange numbers
Design a Python program that ask the user to create an even number list of digits. Then, the program should swap the
first digit with the last digit, 2nd digit with the before last digit …etc.
"""

# Prompt user for an even-sized list of numbers
list_size = int(input("Enter list size (should be even): "))
if list_size % 2 != 0:
    print("Quitting...The list size must be even.")
else:
    print("Populate your list: ")
    users_list = [int(input("Enter a number: ")) for _ in range(list_size)]

    # Swapping first with last, second with second last, and so on
    half_size = list_size // 2
    for i in range(half_size):
        users_list[i], users_list[-(i + 1)] = users_list[-(i + 1)], users_list[i]

    print("Result:", users_list)
