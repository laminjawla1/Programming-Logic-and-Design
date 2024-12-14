"""
9. Series of Integers
Design a Python program to read a series of integers. The first integer is special, as it indicates how many more integers
will follow. The output of the program will be the calculated the sum and average of the integers [excluding the first
integer].
"""

n = int(input("How many numbers to be read? "))
total = 0

for i in range(n):
    next_number = int(input("Enter a number: "))
    total += next_number

if n > 0:
    print("Sum:", total)
    print("Average:", total / n)
else:
    print("You've decided not to input any number.")
