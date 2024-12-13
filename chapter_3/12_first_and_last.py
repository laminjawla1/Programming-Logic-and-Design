"""
12. First and Last
Design a Python program that asks the user for a series of names (in no particular order). After the final person’s name
has been entered, the program should display the name that is first alphabetically and the name that is last
alphabetically. For example, if the user enters the names Kristin, Joel, Adam, Beth, Zeb, and Chris, the program will
display Adam and Zeb.
"""

first = None
last = None

number_of_names = int(input("How many names to be entered? "))

for i in range(number_of_names):
    name = input("Enter name #" + str(i + 1) + ": ")
    if first is None or last is None:
        first = name
        last = name
    else:
        if first > name:
            first = name
        if last < name:
            last = name

if first is not None and last is not None:
    print("First:", first)
    print("Last:", last)
else:
    print("Can't determine first and last.")
