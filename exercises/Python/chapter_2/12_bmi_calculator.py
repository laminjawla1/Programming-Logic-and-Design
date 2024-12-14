"""
12. Body Mass Index Program Enhancement
The Body Mass Index (BMI) is often used to determine whether a person with a inactive lifestyle is overweight or
underweight for his or her height. A person’s BMI is calculated with the following formula:
BMI = Weight × 703 / Height^2
In the formula, weight is measured in pounds and height is measured in inches. Design a Python program that asks the
user to enter the weight and height. The program should calculate the BMI and display a message indicating whether the
person has optimal weight, is underweight, or is overweight. An inactive person’s weight is considered to be optimal if
his or her BMI is between 18.5 and 25. If the BMI is less than 18.5, the person is considered to be underweight. If the
BMI value is greater than 25, the person is considered to be overweight.
"""

comment = ""
weight_status = ""

name = input("Enter your name: ")
weight = float(input("Enter your weight: "))
height = float(input("Enter your height: "))

bmi = weight * 703 / height**2

if bmi < 18.5:
    weight_status = "underweight"
    comment = (
        "Focus on nutrient-dense foods and strength training to gain healthy weight."
    )
elif 18.5 <= bmi <= 25:
    weight_status = "optimal weight"
    comment = "Congratulations! You're doing great. Stay strong and enjoy your healthy lifestyle."
else:
    weight_status = "overweight"
    comment = "It's time to start a weight loss plan. Focus on carbohydrates, proteins, and healthy fats."

print("==========================================================================")
print("Name:", name)
print("Weight:", weight)
print("Height:", height)
print("BMI:", bmi)
print("Weight Status:", weight_status)
print("Comment:", comment)
