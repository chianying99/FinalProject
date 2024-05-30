import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MastermindGame {
    public static void main(String[] args) {
        MastermindGame game = new MastermindGame();
        game.start();
    }


public void start(){
    System.out.println("Welcome to Mastermind!");

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    CodeGenerator codeGenerator = new CodeGenerator(random);
    CodeBreaker codeBreaker = new CodeBreaker(scanner);
    CodeMaker codeMaker = new CodeMaker(codeGenerator.generateCode());

    boolean gameOver = false;
    while (!gameOver) {
        ArrayList<Color> guess = codeBreaker.makeGuess();
        Feedback feedback = codeMaker.provideFeedback(guess);
        System.out.println("Feedback: " + feedback);
        if (feedback.isCorrect()) {
            System.out.println("Congratulations! You've cracked the code.");
            gameOver = true;
        }
    }
    }
}