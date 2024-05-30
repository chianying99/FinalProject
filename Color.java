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

    public String getName() {
        return name;
    }

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


