package structuralDesignPattern.adapter;

public class Adapter implements Shape{
    //we need shape but we have colorful shape, So we should build an adapter to convert colorful shape into shape
    ColorfulShape colorfulShape;

    public Adapter(String shapeType) {
        if(shapeType.equalsIgnoreCase("circle"))
            colorfulShape = new ColorfulCircle();
        else if(shapeType.equalsIgnoreCase("square"))
            colorfulShape = new ColorfulSquare();
    }

    @Override
    public void drawSimple() {
        if (colorfulShape instanceof ColorfulCircle)
            colorfulShape.drawColorful("circle");
        else
            colorfulShape.drawColorful("square");
    }
}
