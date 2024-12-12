"""
9. Swap Two Numbers
Design a Python program that asks the user to enter two numbers. The program should swap the numbers and display.
"""
num1 = int(input("Enter First Number: "))
num2 = int(input("Enter Second Number: "))

temp = num1
num1 = num2
num2 = temp

print("First Number:", num1)
print("Second Number:", num2)
