"""
7. Right Angle Pattern
Design a Python program that makes a pattern such as a right-angle triangle using numbers that repeat.
1
22
333
4444
55555
…
nnnnn
"""

n = int(input("Enter a number: "))

for i in range(1, n + 1):
    print(str(i) * i)
