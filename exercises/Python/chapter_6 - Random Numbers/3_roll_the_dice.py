# 3. Roll the dice
# Design a Python program that rolls three dice. The program should ask the user if wants to continue after a roll.
# ▪ If you roll three sixes, print: 'best hand, triple 6'
# ▪ If you roll three of a kind, print: 'pretty good, triple x', replace x with number
# ▪ If you roll a sequence, print: ‘nice’
# ▪ For any other result, print 'too bad'
import random

def roll_dice():
    return [random.randint(1, 6) for _ in range(3)]

def check_roll(dice):
    dice.sort()  # Sort dice to make sequence detection easier
    if dice == [6, 6, 6]:
        return "best hand, triple 6"
    elif dice[0] == dice[1] == dice[2]:
        return f"pretty good, triple {dice[0]}"
    elif dice[1] - dice[0] == 1 and dice[2] - dice[1] == 1:  # Check for a sequence
        return "nice"
    else:
        return "too bad"

def main():
    while True:
        dice = roll_dice()
        print(f"You rolled: {dice}")
        result = check_roll(dice)
        print(result)
        
        play_again = input("Do you wish to play again (y or n): ").strip().lower()
        if play_again == 'n':
            print("Thanks for playing!")
            break

if __name__ == "__main__":
    main()
