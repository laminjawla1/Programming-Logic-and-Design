"""
6. Sum of a Series of Integers – Part2.
Design a Python program to calculate the series (1) + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n). The output
should look like:
1=1
1+2 = 3
1+2+3 = 6
…
The sum of the above series is:
"""

n = int(input("Enter a number: "))
total = 0

for i in range(1, n + 1):
    row_total = 0
    for j in range(1, i + 1):
        if j < i:
            print(j, "+ ", end="")
        else:
            print(j, end=" ")
        row_total += j
    print("=", row_total)
    total += row_total

print("The sum of the above series is:", total)
