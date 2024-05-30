/**
 * Class representing the possible colors in the Mastermind game.
 */
class Color {
    public static final Color R = new Color("R");
    public static final Color G = new Color("G");
    public static final Color B = new Color("B");
    public static final Color Y = new Color("Y");
    public static final Color O = new Color("O");
    public static final Color P = new Color("P");

    private final String name;

    private Color(String name) {
        this.name = name;
    }

    public static Color[] values() {
        return new Color[]{R, G, B, Y, O, P};
    }

    /**
     * Gets the name of the color.
     *
     * @return The name of the color.
     */
    public String getName() {
        return name;
    }

    /**
     * Converts a string representation of a color to the corresponding Color object.
     *
     * @param color The string representation of the color.
     * @return The Color object corresponding to the string representation.
     * @throws IllegalArgumentException if the color string is invalid.
     */
    public static Color valueOf(String color) {
        switch (color.toUpperCase()) {
            case "R":
                return R;
            case "G":
                return G;
            case "B":
                return B;
            case "Y":
                return Y;
            case "O":
                return O;
            case "P":
                return P;
            default:
                throw new IllegalArgumentException("Invalid color: " + color);
        }
    }
}
