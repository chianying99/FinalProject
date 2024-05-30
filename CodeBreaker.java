import java.util.ArrayList;
import java.util.Scanner;

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
            guess.add(Color.valueOf(String.valueOf(c)));
        }
        return guess;
    }
}
