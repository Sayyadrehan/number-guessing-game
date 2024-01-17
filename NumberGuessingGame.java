
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        int playerGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            playerGuess = scanner.nextInt();
            numberOfTries++;

            if (playerGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }

        } while (playerGuess != randomNumber);

        scanner.close();
    }
}
