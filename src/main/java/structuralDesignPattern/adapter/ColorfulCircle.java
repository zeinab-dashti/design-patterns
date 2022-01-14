package structuralDesignPattern.adapter;

public class ColorfulCircle implements ColorfulShape {
    @Override
    public void drawColorful(String input) {
        System.out.println("Hiiii colorfull " + input);
    }
}
