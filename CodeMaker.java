import java.util.ArrayList;
public class CodeMaker {
    private final Code code;

    public CodeMaker(Code code) {
        this.code = code;
    }

public Feedback provideFeedback(ArrayList<Color> guess) {
    Color[] actualColors = code.getColors();
    Color[] guessColors = guess.toArray(new Color[0]);

    int correctPositionAndColor = 0;
    int correctColorOnly = 0;

    boolean[] checked = new boolean[actualColors.length];

    for (int i = 0; i < actualColors.length; i++) {
        if (actualColors[i] == guessColors[i]) {
            correctPositionAndColor++;
            checked[i] = true;
            }
        }

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
}