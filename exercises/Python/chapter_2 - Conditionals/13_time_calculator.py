"""
13. Time Calculator
Design a Python program that asks the user to enter a number of seconds, and works as follows:
• There are 60 seconds in a minute. If the number of seconds entered by the user is greater than or equal to 60, the
program should display the number of minutes in that many seconds.
• There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater than or equal to 3,600,
the program should display the number of hours in that many seconds.
• There are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400,
the program should display the number of days in that many seconds.
"""

seconds = float(input("Enter the number of seconds: "))

days = seconds // 86400
seconds %= 86400

hours = seconds // 3600
seconds %= 3600

minutes = seconds // 60
seconds %= 60

print("Days:", days)
print("Hours:", hours)
print("Minutes:", minutes)
print("Seconds:", seconds)
