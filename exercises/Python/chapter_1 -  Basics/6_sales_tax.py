"""
6. Sales Tax
Design a Python program that will ask the user to enter the amount of a purchase. The program should then compute
the VAT tax. The program should display the amount of the purchase, the VAT tax, and the total of the sale (which is the
sum of the amount of purchase plus the VAT tax).
Hint: Use the value 0.15 to represent 15%.
"""

amount_of_a_purchase = float(input("Enter an amount of a purchase: "))
vat_tax = 0.15 * amount_of_a_purchase
total_sale = amount_of_a_purchase + vat_tax

print("Amount of a purchase:", amount_of_a_purchase)
print("VAT Tax:", vat_tax)
print("Total Sale:", total_sale)
