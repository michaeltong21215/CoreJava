package FactoryPattern;

public class ShapeFactoryClient {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("Rectangle");
        Shape shapeTwo = factory.getShape("Circle");
        Shape shapeThree = factory.getShape("Square");
        shape.draw();
        shapeTwo.draw();
        shapeThree.draw();
    }
}
