import java.util.ArrayList;
/**
 * Class representing the code maker in the Mastermind game.
 */
/**
 * Class representing the code maker in the Mastermind game.
 */
class CodeMaker {
    private final Code code;

    public CodeMaker(Code code) {
        this.code = code;
    }

    /**
     * Provides feedback to the code breaker based on the guess.
     *
     * @param guess The guess made by the code breaker.
     * @return Feedback indicating how close the guess was to the actual code.
     */
    public Feedback provideFeedback(ArrayList<Color> guess) {
        Color[] actualColors = code.getColors();
        Color[] guessColors = guess.toArray(new Color[0]);

        int correctPositionAndColor = 0;
        int correctColorOnly = 0;

        boolean[] checked = new boolean[actualColors.length];

        // Checks for correct position and color
        for (int i = 0; i < actualColors.length; i++) {
            if (actualColors[i] == guessColors[i]) {
                correctPositionAndColor++;
                checked[i] = true;
            }
        }

        // Checks for correct color only
        for (int i = 0; i < actualColors.length; i++) {
            if (!checked[i]) {
                for (int j = 0; j < guessColors.length; j++) {
                    if (!checked[j] && actualColors[i] == guessColors[j]) {
                        correctColorOnly++;
                        checked[j] = true;
                        break;
                    }
                }
            }
        }

        return new Feedback(correctPositionAndColor, correctColorOnly);
    }


    public Code getCode() {
        return code;
    }
}


