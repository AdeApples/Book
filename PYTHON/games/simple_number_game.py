import random

# Guess the Number Game
# The computer picks a random number between 1 and 100
# You have to guess it!

print("=" * 40)
print("Welcome to Guess the Number!")
print("=" * 40)

# Generate a random number between 1 and 100
secret_number = random.randint(1, 100)

# Keep track of guesses
guesses = 0
guessed = False

print("\nI'm thinking of a number between 1 and 100...")
print("Can you guess it?\n")

# Loop until the player guesses correctly
while not guessed:
    # Get the player's guess
    guess = int(input("Enter your guess: "))
    guesses += 1
    
    # Check if the guess is correct
    if guess == secret_number:
        print(f"\n🎉 You got it! The number was {secret_number}")
        print(f"You guessed it in {guesses} tries!")
        guessed = True
    elif guess < secret_number:
        print("📈 Too low! Try a higher number.")
    else:
        print("📉 Too high! Try a lower number.")

print("\nThanks for playing!")
