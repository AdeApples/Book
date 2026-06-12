import java.util.Scanner;
import java.util.Random;

/**
 * Guess the Number Game
 * The computer picks a random number between 1 and 100
 * You have to guess it!
 */
public class SimpleNumberGame {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object for generating random numbers
        Random random = new Random();
        
        // Print welcome message
        System.out.println("=".repeat(40));
        System.out.println("Welcome to Guess the Number!");
        System.out.println("=".repeat(40));
        
        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        
        // Keep track of guesses
        int guesses = 0;
        boolean guessed = false;
        
        System.out.println("\nI'm thinking of a number between 1 and 100...");
        System.out.println("Can you guess it?\n");
        
        // Loop until the player guesses correctly
        while (!guessed) {
            // Get the player's guess
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            guesses++;
            
            // Check if the guess is correct
            if (guess == secretNumber) {
                System.out.println("\n🎉 You got it! The number was " + secretNumber);
                System.out.println("You guessed it in " + guesses + " tries!");
                guessed = true;
            } else if (guess < secretNumber) {
                System.out.println("📈 Too low! Try a higher number.");
            } else {
                System.out.println("📉 Too high! Try a lower number.");
            }
        }
        
        System.out.println("\nThanks for playing!");
        scanner.close();
    }
}
