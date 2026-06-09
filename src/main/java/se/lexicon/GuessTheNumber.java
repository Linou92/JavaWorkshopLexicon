package se.lexicon;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void printGuessTheNumber() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(500) + 1;

        int guess = 0;
        int attempts = 0;

        while (guess != secretNumber) {

            IO.println("Enter your guess: ");

            // Input validation loop
            if (!scanner.hasNextInt()) {
                IO.println("Please enter a valid number!");
                scanner.next(); // discard invalid input
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                IO.println("Too big!");
            } else if (guess < secretNumber) {
                IO.println("Too small!");
            } else {
                IO.println("Correct! You got it in " + attempts + " guesses.");
            }
        }
    }
}
