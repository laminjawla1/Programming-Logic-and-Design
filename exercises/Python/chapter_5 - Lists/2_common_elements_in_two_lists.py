"""
2. Common elements in two lists
Design a Python program that asks the user to create two lists of numbers of any sizes . Then, the program should find
the common elements between the two lists.
"""

# Get the first list of numbers from the user
print("Enter elements for the first list:")
first_list = []
while True:
    number = input("Enter a number (or type 'stop' to finish): ")
    if number.lower() == "stop":
        break
    first_list.append(int(number))

# Get the second list of numbers from the user
print("Enter elements for the second list:")
second_list = []
while True:
    number = input("Enter a number (or type 'stop' to finish): ")
    if number.lower() == "stop":
        break
    second_list.append(int(number))

# Find the common elements using set intersection
common_elements = list(set(first_list) & set(second_list))

# Output the results
print("First List:", first_list)
print("Second List:", second_list)
print("Common Elements:", common_elements)
