"""
8. Color Mixer
The colors red, blue, and yellow are known as the primary colors because they cannot be made by mixing other colors.
When you mix two primary colors, you get a secondary color, as shown here:
- When you mix red and blue, you get purple.
- When you mix red and yellow, you get orange.
- When you mix blue and yellow, you get green.
Design a Python program that prompts the user to enter the names of two primary colors to mix. If the user enters
anything other than “red,” “blue,” or “yellow,” the program should display an error message. Otherwise, the program
should display the name of the secondary color that results.
"""

color_1 = input("Enter color 1: ")
color_2 = input("Enter color 2: ")

match color_1:
    case "red":
        if color_2 == "blue":
            print("purple")
        elif color_2 == "yellow":
            print("orange")
        else:
            print("The color is invalid")
    case "blue":
        if color_2 == "red":
            print("purple")
        elif color_2 == "yellow":
            print("green")
        else:
            print("The color is invalid")
    case "yellow":
        if color_2 == "red":
            print("orange")
        elif color_2 == "blue":
            print("green")
    case _:
        print("The color is invalid")
