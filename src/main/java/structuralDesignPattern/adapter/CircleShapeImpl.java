package structuralDesignPattern.adapter;

public class CircleShapeImpl implements Shape {
    @Override
    public void drawSimple() {
        System.out.println("I am circle");
    }
}
