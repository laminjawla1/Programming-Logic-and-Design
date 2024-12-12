"""
3. Land Calculation
One hectare of land is equivalent to 10,000 square meters. Design a Python program that asks the user to enter the total
square meters in a tract of land and calculates the number of hectares in the tract.
Hint: Divide the amount entered by 10,000 to get the number of hectares.
"""
total_square_meters = float(input("Total Square Meters: "))
hectares = total_square_meters / 10000
print("Hectares:", hectares)
