"""
7. Magic Dates
The date June 10, 1960, is special because when it is written in the following format, the month times the day equals the
year:
6/10/60
Design a Python program that asks the user to enter a month (in numeric form), a day, and a two-digit year. The program
should then determine whether the month times the day equals the year. If so, it should display a message saying the
date is magic. Otherwise, it should display a message saying the date is not magic.
"""

day = int(input("Enter a day in numeric: "))
month = int(input("Enter a month in numeric: "))
year = int(input("Enter a year in number (yy): "))

if day * month == year:
    print("The date is magic")
else:
    print("The date is not magic")
