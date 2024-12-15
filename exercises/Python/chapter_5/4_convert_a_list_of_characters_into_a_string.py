"""
4. Convert a list of characters into a string
Design a Python program that asks the user to create a list of characters.
Then, the program should convert it to a string
"""

# Initialize an empty list
list_of_characters = []

print("Create a list of characters: ")
while True:
    character = input("Enter a character (or type 'stop' to finish): ")
    if character.lower() == "stop":
        break
    if len(character) != 1:
        print("Please enter only one character at a time.")
        continue
    list_of_characters.append(character)

# Convert the list of characters into a string
result_string = "".join(list_of_characters)

# Output results
print("List of characters:", list_of_characters)
print("Converted to string:", result_string)
