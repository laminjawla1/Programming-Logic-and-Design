"""
10. Celsius to Fahrenheit Temperature Converter
Design a Python program that converts Celsius temperatures to Fahrenheit temperatures.
The formula is as follows:

F = (9/5)C + 32

The program should ask the user to enter a temperature in Celsius, and then display the temperature converted to
Fahrenheit.
"""

celsius = float(input("Enter temperature in celsius: "))
fahrenheit = (9 / 5) * celsius + 32
print("Temperature In Fahernheit:", fahrenheit)
