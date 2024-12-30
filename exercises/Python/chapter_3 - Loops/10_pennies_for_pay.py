"""
10. Pennies for Pay
Design a Python program that calculates the amount of money a person would earn over a period of time if his or her
salary is one penny the first day, two pennies the second day, and continues to double each day. The program should ask
the user for the number of days. Display the total pay at the end of the period. The output should be displayed in a dollar
amount, not the number of pennies.
"""
# Prompt the user to enter the number of days
number_of_days = int(input("Enter the number of days: "))

# Validate the input
if number_of_days <= 0:
    print("The number of days must be greater than zero.")
else:
    # Initialize variables
    total_pay_in_pennies = 0
    daily_pay = 1  # Start with 1 penny on the first day

    # Calculate the total pay
    for day in range(1, number_of_days + 1):
        total_pay_in_pennies += daily_pay
        daily_pay *= 2  # Double the daily pay each day

    # Convert the total pay to dollars
    total_pay_in_dollars = total_pay_in_pennies / 100

    # Display the result
    print(f"Total pay for {number_of_days} days is: ${total_pay_in_dollars:.2f}")
