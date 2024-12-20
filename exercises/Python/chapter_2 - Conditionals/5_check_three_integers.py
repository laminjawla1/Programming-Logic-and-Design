"""
5. Check Three Integers
Design a Python program to check the largest number among three given integers.
"""

first_number = int(input("Enter first number: "))
second_number = int(input("Enter second number: "))
third_number = int(input("Enter third number: "))

largest = first_number

if second_number > largest:
    largest = second_number

if third_number > largest:
    largest = third_number

print("Largest:", largest)
