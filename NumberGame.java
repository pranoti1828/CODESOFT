import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // 1 to 100

        Scanner sc = new Scanner(System.in);
        int guess = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too High! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        sc.close();
    }
}
