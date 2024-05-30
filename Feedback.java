/**
 * Class representing the feedback given to the code breaker in the Mastermind game.
 */
class Feedback {
    private final int correctPositionAndColor;
    private final int correctColorOnly;

    public Feedback(int correctPositionAndColor, int correctColorOnly) {
        this.correctPositionAndColor = correctPositionAndColor;
        this.correctColorOnly = correctColorOnly;
    }

    public boolean isCorrect() {
        return correctPositionAndColor == 4;
    }

    @Override
    public String toString() {
        return correctPositionAndColor + " correct position and color, " +
                correctColorOnly + " correct color only";
    }
}
