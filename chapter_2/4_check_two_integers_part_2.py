"""
4. Check Two Integers – Part2
Design a Python program to check a given integer and return true if it is within 10 of 100 or 10 of 200.
"""

number = int(input("Enter a number: "))

if (90 <= number <= 110) or (190 <= number <= 210):
    print(True)
else:
    print(False)
