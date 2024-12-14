"""
1. Difference between max and min
Design a Python program that asks the user to create a list of numbers. The program should ask the user when to stop
inserting numbers in the list. Then, the program should find the difference between the largest and smallest numbers in
the list.
"""
# Initialize an empty list to hold the numbers
list_of_numbers = []

# Keep asking for numbers until the user decides to stop
while True:
    number = input("Enter a number (or type 'stop' to finish): ")
    if number.lower() == "stop":
        break
    list_of_numbers.append(int(number))

# Check if the list has at least one number
if list_of_numbers:
    # Find the min and max using built-in functions
    smallest = min(list_of_numbers)
    largest = max(list_of_numbers)
    print("Smallest:", smallest)
    print("Largest:", largest)
    print("The difference between the smallest and largest:", largest - smallest)
else:
    print("No numbers entered.")
