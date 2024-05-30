import java.util.Random;

class CodeGenerator {
    private final Random random;
    public CodeGenerator(Random random){
        this.random = random;
    }

    public Code generateCode(){
        Color[] colors = new Color[4];

        for (int i= 0; i < colors.length; i++){
            colors[i] = Color.valueOf()[random.nextInt(Color.valueOf().length)];
        }
        return hashCode(colors);
    }

}
