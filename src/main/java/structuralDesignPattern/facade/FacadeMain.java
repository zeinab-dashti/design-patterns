package structuralDesignPattern.facade;

public class FacadeMain {
    /*Factory is for hiding complexity for creating objects. For example different object is created based
    on different situation*/
    /*Facade is for hiding complexity for multiple subsystems. It's not only related to creating objects*/
    //Every Abstract Factory is a Facade Design Pattern
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.createShapes();
    }
}
