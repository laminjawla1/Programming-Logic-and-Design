"""
1. Count digits in a string

Design a Python program that will ask the user to enter a string.
The program will count the sum of all digits in the string.
"""

# Initialize total and n_digits to 0
total = None
n_digits = 0

# Get a string from the user
string = input("Enter a string of text: ")

# Iterate over the characters in the string
for character in string:
    # If the character is a digit, add its integer value to total
    if character >= "0" and character <= "9":  # character.isdigit()
        # Initialize total
        if total is None:
            total = 0
        total += int(character)
        n_digits += 1

# Output the result
if total == None:
    print("Your string contains no valid digits.")
else:
    print(f"A total of {n_digits} digit(s) found")
    print(f"Sum of digits found in your string is: {total}")
