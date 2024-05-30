import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MastermindGame {
    public static void main(String[] args) {
        MastermindGame game = new MastermindGame();
        game.start();
    }


    public void start() {
        System.out.println("Welcome to Mastermind! :D");
        System.out.println("Guess the 4-color code using 10 attempts.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        CodeGenerator codeGenerator = new CodeGenerator(random);
        CodeMaker codeMaker = new CodeMaker(codeGenerator.generateCode());
        CodeBreaker codeBreaker = new CodeBreaker(scanner);

        int remainingTurns = 10;
        boolean gameOver = false;

        while (!gameOver && remainingTurns > 0) {
            ArrayList<Color> guess = codeBreaker.makeGuess();
            Feedback feedback = codeMaker.provideFeedback(guess);
            System.out.println("Feedback: " + feedback);
            if (feedback.isCorrect()) {
                System.out.println("Congratulations! You've cracked the code! :D");
                gameOver = true;
            }
            remainingTurns--;
        }

        if (!gameOver) {
            System.out.println("Sorry, you've run out of turns! D: ");
            System.out.println("The code was: " + Arrays.toString(codeMaker.getCode().getColors()));
        }
        scanner.close();
    }
}

