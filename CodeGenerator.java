import java.util.Random;

/**
 * Class representing the code generator in the Mastermind game.
 */
class CodeGenerator {
    private final Random random;

    public CodeGenerator(Random random) {
        this.random = random;
    }

    /**
     * Generates a random code.
     *
     * @return A randomly generated code.
     */
    public Code generateCode() {
        Color[] colors = new Color[4];
        for (int i = 0; i < colors.length; i++) {
            colors[i] = Color.values()[random.nextInt(Color.values().length)];
        }
        return new Code(colors);
    }
}
