# 4. Slot Machine Simulation
# A slot machine is a gambling device that the user inserts money into and then pulls a lever (or presses a button).
# The slot machine then displays a set of random images. If two or more of the images match,
# the user wins an amount of money, which the slot machine dispenses back to the user.

# 1. Design a Python program that simulates a slot machine. When the program runs, it should do the following:
# 2. Ask the user to enter the amount of money he or she wants to insert into the slot machine.
# 3. Instead of displaying images, the program will randomly select a word from the following list:
#    Cherries, Oranges, Plums, Bells, Melons, Bars
# 4. The program will select and display a word from this list three times.
# 5. If none of the randomly selected words match, the program will inform the user that he or she has won $0.
# 6. If two of the words match, the program will inform the user that he or she has won two times the amount entered.
# 7. If three of the words match, the program will inform the user that he or she has won three times the amount entered.
import random

def main():
    # Ask the user to enter the amount of money to insert into the slot machine
    while True:
        try:
            amount = float(input("Enter the amount of money you want to insert: "))
            if amount <= 0:
                print("Please enter a positive amount.")
                continue
            break
        except ValueError:
            print("Invalid input. Please enter a valid number.")
    
    # List of possible outcomes
    options = ["Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"]
    
    # Randomly select three words
    chosen = [random.choice(options) for _ in range(3)]
    print(f"Slot Machine Results: {chosen[0]} | {chosen[1]} | {chosen[2]}")
    
    # Calculate winnings based on matches
    if chosen[0] == chosen[1] == chosen[2]:  # All three match
        winnings = amount * 3
        print(f"Jackpot! All three match. You win ${winnings:,.2f}")
    elif chosen[0] == chosen[1] or chosen[1] == chosen[2] or chosen[0] == chosen[2]:  # Two match
        winnings = amount * 2
        print(f"Nice! Two match. You win ${winnings:,.2f}")
    else:  # No matches
        winnings = 0
        print("No matches. You win $0. Better luck next time!")
    
if __name__ == "__main__":
    main()
