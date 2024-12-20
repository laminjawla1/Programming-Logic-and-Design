"""
8. Tuition Increase
At one college, the tuition for a full-time student is $6,000 per semester. It has been announced that the tuition will
increase by 2 percent each year for the next five years. Design a Python program with a loop that displays the projected
semester tuition amount for the next five years.
"""

years = 5
tuition_fee = 6000
incr_percentage = 0.02

print("SEMESTER FEE FOR THE NEXT 5 YEARS:")
for year in range(1, years + 1):
    tuition_fee += tuition_fee * incr_percentage
    print("Year", year, "is:", tuition_fee)
