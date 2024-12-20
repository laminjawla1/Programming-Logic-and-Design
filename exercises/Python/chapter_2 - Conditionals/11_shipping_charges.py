"""
11. Shipping Charges

The Fast Freight Shipping Company charges the following rates:
Weight of Package                           Rate per Pound
2 pounds or less                            $1.10
Over 2 pounds but not more than 6 pounds    $2.20
Over 6 pounds but not more than 10 pounds   $3.70
Over 10 pounds                              $3.80
Design a Python program that asks the user to enter the weight of a package and then displays the shipping charges.
"""

weight = float(input("Enter the weight of a package: "))

if weight <= 2:
    print("Charges:", "$1.10")
elif 2 < weight <= 6:
    print("Charges:", "$2.20")
elif 6 < weight <= 10:
    print("Charges:", "$3.70")
elif weight > 10:
    print("Charges:", "$3.80")
else:
    print("An unknown error occurred!")
