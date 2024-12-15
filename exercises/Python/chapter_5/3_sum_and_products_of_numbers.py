"""
3. Sum and product of numbers
Design a Python program that asks the user to create a list of numbers. Then, the program should find the sum and
product of numbers with odd indices.
"""

# Initialize variables
list_of_numbers = []
sum_odd_indices = 0
product_odd_indices = 1

print("Create a list of numbers:")
while True:
    number = input("Enter a number (or type 'stop' to finish): ")
    if number.lower() == "stop":
        break
    list_of_numbers.append(int(number))

# Handle empty list case
if not list_of_numbers:
    print("The list is empty. Sum and product cannot be calculated.")
else:
    # Calculate sum and product for numbers at odd indices
    for i in range(1, len(list_of_numbers), 2):
        sum_odd_indices += list_of_numbers[i]
        product_odd_indices *= list_of_numbers[i]

    # Display results
    print("\nList of Numbers:", list_of_numbers)
    print("Sum of numbers at odd indices:", sum_odd_indices)
    print(
        "Product of numbers at odd indices:",
        product_odd_indices if len(list_of_numbers) > 1 else 0,
    )
