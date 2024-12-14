"""
5. Sum of a Series of Integers - Part1.
Design a Python program to calculate the sum of the series (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n). The output
should look like:
1*1 = 1
2*2 = 4
3*3 = 9
…
The sum of the above series is:
"""

n = int(input("Enter a number: "))
total = 0

for i in range(1, n + 1):
    total += i * i
    print(i, "*", i, "=", i * i)

print("The sum of the above series is:", total)
