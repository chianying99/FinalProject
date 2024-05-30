/**
 * Class representing the code to be guessed in the Mastermind game.
 */
public class Code {
    private final Color[] colors;

    public Code(Color[] colors) {
        this.colors = colors;
    }

    public Color[] getColors() {
        return colors;
    }
}