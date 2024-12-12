"""
2. Areas of Rectangles
The area of a rectangle is the rectangle's length times its width.
Design a Python program that asks for the length and width of two rectangles.
The program should tell the user which rectangle has the greater area, or whether the areas are the same.
"""

# First rectangles information
length = float(input("Enter Length For First Rectangle: "))
width = float(input("Enter Width For First Rectangle: "))
area_1 = length * width

# Second rectangles information
length = float(input("Enter Length For First Rectangle: "))
width = float(input("Enter Width For First Rectangle: "))
area_2 = length * width

if area_1 > area_2:
    print("First Rectangle Is Greater")
elif area_2 > area_1:
    print("Second Rectangle Is Greater")
else:
    print("Both Rectangles Are Same")
