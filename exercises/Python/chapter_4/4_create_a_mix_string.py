"""
4. Create a mix string
Design a Python program that will ask the user to enter three strings. The program will check the length of each string
and use the length of the shortest as reference. Then the program will create and display a fourth string with the first
character from each string, followed by the second character from each string till reaching the reference length.
"""

# Get the three strings from the user
string_1 = input("Enter the first string: ")
string_2 = input("Enter the second string: ")
string_3 = input("Enter the third string: ")

# Get lengths of all the strings
string_1_len = len(string_1)
string_2_len = len(string_2)
string_3_len = len(string_3)

# Find the minimum string length and use that as reference
reference = min(string_1_len, string_2_len, string_3_len)

mixed_string = ""

for i in range(reference):
    mixed_string += f"{string_1[i]}{string_2[i]}{string_3[i]}"

print("Mixed String:", mixed_string)
