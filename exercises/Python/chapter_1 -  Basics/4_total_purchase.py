"""
4. Total Purchase
A customer in a store is purchasing five items. Design a Python program that asks for the price of each item, and then
displays the subtotal of the sale, the amount of sales tax, and the total. Assume the sales tax is 6 percent.
"""

item_1 = float(input("Price for item #1: "))
item_2 = float(input("Price for item #2: "))
item_3 = float(input("Price for item #3: "))
item_4 = float(input("Price for item #4: "))
item_5 = float(input("Price for item #5: "))

subtotal = item_1 + item_2 + item_3 + item_4 + item_5
sales_tax = 0.06 * subtotal
total = subtotal + sales_tax

print("Subtotal:", subtotal)
print("Sales Tax:", sales_tax)
print("Total:", total)
