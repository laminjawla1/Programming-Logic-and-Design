"""
3. Check Two Integers – Part1
Design a Python program to check two given integers and return true if one of them is 30 or if their sum is 30.
"""

first_number = int(input("Enter the first number: "))
second_number = int(input("Enter the second number: "))

if (first_number == 30 or second_number == 30) or (first_number + second_number == 30):
    print(True)
else:
    print(False)
