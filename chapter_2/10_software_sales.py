"""
10. Software Sales
A software company sells a package that retails for $99. Quantity discounts are given according to the following table:
Quantity    Discount
10 - 19     20%
20 - 49     30%
50 - 99     40%
>= 100      50%
Design a Python program that asks the user to enter the number of packages purchased.
The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount.
"""

quantity = 0
discount = 0.0
discount_amount = 0.0
amount_with_discount = 0.0
amount_without_discount = 0.0

error_occurred = False

quantity = int(input("Enter Quantity Of Packages Purchased: "))

if quantity >= 100:
    discount = 0.5
elif quantity >= 50:
    discount = 0.4
elif quantity >= 20:
    discount = 0.3
elif quantity >= 10:
    discount = 0.2
else:
    error_occurred = True

if not error_occurred:
    amount_without_discount = quantity * 99
    discount_amount = discount * amount_without_discount
    amount_with_discount = amount_without_discount - discount_amount

    print("Amount:", amount_without_discount)
    print("Discount:", discount * 100, "%")
    print("Discounted Amount:", amount_with_discount)
else:
    print("An error occurred! Please provide a valid number of packages purchased.")
