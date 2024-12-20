"""
3. Sum of Numbers – Part1.
Design a Python program with a loop that asks the user to enter a series of positive numbers. The user should enter a
negative number to signal the end of the series. After all the positive numbers have been entered, the program should
display their sum.
"""

total = 0
next_num = int(input("Enter a positive number (negative number to signal end): "))

while next_num >= 0:
    total += next_num
    next_num = int(input("Enter a positive number (negative number to signal end): "))

print("Total:", total)
