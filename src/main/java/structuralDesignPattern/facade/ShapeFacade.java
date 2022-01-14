package structuralDesignPattern.facade;

public class ShapeFacade {
    private CircleShape circleShape;
    private SquareShape squareShape;

    public ShapeFacade() {
        this.circleShape = new CircleShape();
        this.squareShape = new SquareShape();
    }

    public void createShapes(){
        circleShape.resize();
        squareShape.color();
    }
}
