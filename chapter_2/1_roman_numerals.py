"""
1. Roman Numerals

Design a Python program that prompts the user to enter a number within the range of through 10.
The program should display the Roman numeral version of that number.
If the number is outside the range of 1 through 10, the program should display an error message.
"""

number = int(input("Enter a number: "))

match number:
    case 1:
        print("I")
    case 2:
        print("II")
    case 3:
        print("III")
    case 4:
        print("IV")
    case 5:
        print("V")
    case 6:
        print("VI")
    case 7:
        print("VII")
    case 8:
        print("VIII")
    case 9:
        print("IX")
    case 10:
        print("X")
    case _:
        print("Error: Number should be between 1 and 10.")
