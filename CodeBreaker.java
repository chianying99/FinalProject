import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class representing the code breaker in the Mastermind game.
 */
public class CodeBreaker implements Player {
    private final Scanner scanner;

    public CodeBreaker(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public ArrayList<Color> makeGuess() {
        System.out.println("Enter your guess (e.g., RYGB): ");
        String input = scanner.nextLine();
        ArrayList<Color> guess = new ArrayList<>();
        for (char c : input.toCharArray()) {
            try {
                guess.add(Color.valueOf(String.valueOf(c)));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + c);
                return null; // Return null to indicate invalid input
            }
        }
        return guess;
    }
}