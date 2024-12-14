"""
6. Mass and Weight
Scientists measure an object’s mass in kilograms and its weight in Newtons. If you know the amount of mass of an
object, you can calculate its weight, in Newtons, with the following formula:
Weight = Mass × 9.8
Design a Python program that asks the user to enter an object’s mass, and then calculates its weight. If the object weighs
more than 1,000 Newtons, display a message indicating that it is too heavy. If the object weighs less than 10 Newtons,
display a message indicating that it is too light.
"""

mass = float(input("Enter Mass: "))

weight = mass * 9.81

if weight > 1000:
    print("It's too heavy")
elif weight < 10:
    print("It's too light")
else:
    print("The weight is normal")
