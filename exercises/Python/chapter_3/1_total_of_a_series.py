"""
1. Total of a Series of Numbers
Design a Python program that asks the user to enter a positive integer number and calculates the total of the following
series of numbers: 1/n + 2/(n-1) + 3/(n-2) + 4/(n-3) + 5/(n-4) … + n/1
(Hint, if you enter 4 then the program will calculate the total of 1/4 + 2/3 + 3/2 + 4/1)
"""

n = int(input("Enter a number: "))
i = 1
j = n
total = 0

while i <= n:
    total += i / j
    i += 1
    j -= 1

print("Sum:", total)
