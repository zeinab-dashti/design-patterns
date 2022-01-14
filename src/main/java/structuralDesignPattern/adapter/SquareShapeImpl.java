package structuralDesignPattern.adapter;

public class SquareShapeImpl implements Shape {
    @Override
    public void drawSimple() {
        System.out.println("I am Square");
    }
}
