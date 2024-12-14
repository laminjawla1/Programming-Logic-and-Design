"""
3. Remove non alphabet characters
Design a Python program that will ask the user to enter a string. The program will remove all non-alphabet characters
(digits and symbols) and display the result.
"""

# Get a string from the user
string = input("Enter a string: ")
# The filtered string will contain a string with alphabets only
filtered_string = ""

# For every character in the string entered by the user
for character in string:
    # Check if the current character is an alphabet
    # If it is an alphabet, add it to the filtered string
    # Otherwise, skip it.
    if (character >= "a" and character <= "z") or (
        character >= "A" and character <= "Z"
    ):  # character.isalpha()
        filtered_string += character
print("Filtered String:", filtered_string)
