"""
8. Area of a Trapezoid
Design a Python program that will ask the user to enter the two bases of a trapezoid and height. The program should
computer the area and display the result. (Hint: area of the trapezoid is 1⁄2 *(base1 + base2)*height)
"""
base_1 = float(input("Enter base 1: "))
base_2 = float(input("Enter base 2: "))
height = float(input("Enter height: "))

area = 0.5 * (base_1 + base_2) * height

print("Area of a trapezoid:", area)
