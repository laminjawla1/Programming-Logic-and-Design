# 1. Rock, Paper, Scissors Game
# Design a Python program that lets the user play the game of Rock, Paper, Scissors against
# the computer. The program should work as follows:
# i. When the program begins, a random number in the range of 1 through 3 is generated.
#   If the number is 1, then the computer has chosen rock.
#   If the number is 2, then the computer has chosen paper.
#   If the number is 3, then the computer has chosen scissors. (Don’t display the computer’s choice yet).
# ii. The user enters his or her choice of “rock,” “paper,” or “scissors” at the keyboard.
# iii. The computer’s choice is displayed.
# iv. The program should display a message indicating whether the user or the computer was the winner.
# A winner is selected according to the following rules:
# ▪ If one player chooses rock and the other player chooses scissors, then rock wins. (The rock smashes the scissors).
# ▪ If one player chooses scissors and the other player chooses paper, then scissors wins. (Scissors cut paper).
# ▪ If one player chooses paper and the other player chooses rock, then paper wins. (Paper wraps rock).
# ▪ If both players make the same choice, the game must be played again to determine the winner.
import random
import os

def main():
    choices = ["rock", "paper", "scissors"]

    clear_screen()
    while True:
        print("1. Rock \t2. Paper \t3. Scissors")
        
        try:
            user_choice_index = int(input("Choose (1, 2, or 3): ")) - 1
            if user_choice_index not in [0, 1, 2]:
                print("Invalid choice. Please choose a number between 1 and 3.")
                continue
        except ValueError:
            print("Invalid input. Please enter a number.")
            continue

        user_choice = choices[user_choice_index]
        computer_choice = random.choice(choices)

        clear_screen()
        print("COMPUTER:", computer_choice)
        print("USER:", user_choice)

        # Determine winner
        if user_choice == computer_choice:
            print("It's a TIE! Play again.\n")
            continue
        elif (user_choice == "rock" and computer_choice == "scissors") or \
            (user_choice == "scissors" and computer_choice == "paper") or \
            (user_choice == "paper" and computer_choice == "rock"):
            print("USER WINS!")
        else:
            print("COMPUTER WINS!")
        
        # Exit the game after determining a winner
        break


def clear_screen():
    """Clears the console screen."""
    os.system("cls" if os.name == "nt" else "clear")


if __name__ == "__main__":
    main()
