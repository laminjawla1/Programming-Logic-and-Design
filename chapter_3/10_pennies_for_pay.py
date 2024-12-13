"""
10. Pennies for Pay
Design a Python program that calculates the amount of money a person would earn over a period of time if his or her
salary is one penny the first day, two pennies the second day, and continues to double each day. The program should ask
the user for the number of days. Display the total pay at the end of the period. The output should be displayed in a dollar
amount, not the number of pennies.
"""

number_of_days = int(input("Enter the number of days: "))
total_pay = 1.0

for day in range(number_of_days):
    total_pay += 2**day

if number_of_days > 0:
    print("Total Pay:", total_pay / 100)
else:
    print("No pay was calculated.")
