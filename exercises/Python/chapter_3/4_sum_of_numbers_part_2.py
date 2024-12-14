"""
4. Sum of Numbers – Part2.
Design a Python program that calculates and prints the sum of cubes of even numbers up to a specified limit (e.g., 20)
using a while loop.
"""

limit = int(input("Enter the limit: "))
total = 0

start = 2
while start <= limit:
    total += start**3
    start += 2

print("Total of cubes:", total)
