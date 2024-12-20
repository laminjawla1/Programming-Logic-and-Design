"""
11. Largest and Smallest
Design a Python program with a loop that lets the user enter a series of numbers. The user should enter –99 to signal the
end of the series. After all the numbers have been entered, the program should display the largest and smallest numbers
entered.
"""

smallest = None
largest = None

number = int(input("Enter a number (-99 to end): "))

while number != -99:
    if smallest is None or largest is None:
        smallest = number
        largest = number
    else:
        if smallest > number:
            smallest = number
        if largest < number:
            largest = number
    number = int(input("Enter a number (-99 to end): "))

if smallest is not None and largest is not None:
    print("Smallest:", smallest)
    print("Largest:", largest)
else:
    print("Can't determine smallest and largest.")
