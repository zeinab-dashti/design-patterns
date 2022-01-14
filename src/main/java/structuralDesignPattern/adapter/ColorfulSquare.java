package structuralDesignPattern.adapter;

public class ColorfulSquare implements ColorfulShape {
    @Override
    public void drawColorful(String input) {
        System.out.println("hiiiii again colorfull " + input);
    }
}
