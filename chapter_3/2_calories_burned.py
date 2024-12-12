"""
2. Calories Burned
Running on a particular treadmill you burn 3.9 calories per minute. Design a Python program that uses a loop to display
the number of calories burned after 10, 15, 20, 25, and 30 minutes.
"""

for minutes in range(10, 35, 5):
    calories_burned = minutes * 3.9
    print("Calories burned in", minutes, "minutes is:", calories_burned)
