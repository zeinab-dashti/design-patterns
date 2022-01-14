package structuralDesignPattern.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        //https://dzone.com/articles/adapter-design-pattern-in-java
        Shape circle = new CircleShapeImpl();
        Shape square = new SquareShapeImpl();
        circle.drawSimple();
        square.drawSimple();

        Shape colorfulCircle = new Adapter("circle");
        Shape colorfullsquare = new Adapter("square");
        colorfulCircle.drawSimple();
        colorfullsquare.drawSimple();
    }
}
