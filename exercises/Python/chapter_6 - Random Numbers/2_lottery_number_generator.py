# 2. Lottery Number Generator
# Design a Python program that will generate a 7-digit lottery number in a list. The randomly generated numbers are from
# 0 to 49.
import random


lottery_number = [random.randint(0, 49) for _ in range(7)]
print(f"Lottery Number: {lottery_number}")
