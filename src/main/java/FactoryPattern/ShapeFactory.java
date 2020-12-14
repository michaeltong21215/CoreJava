package FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if("Circle".equals(shapeType)){
            return new Circle();
        } else if("Rectangle".equals(shapeType)){
            return new Rectangle();
        } else if("Square".equals(shapeType)){
            return new Square();
        }
        return null;
    }
}
