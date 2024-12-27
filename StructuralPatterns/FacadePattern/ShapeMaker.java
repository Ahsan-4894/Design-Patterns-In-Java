package StructuralPatterns.FacadePattern;

//this is the FACADE class!
public class ShapeMaker {
    private Circle cricle = null;
    private Square square = null;

    public ShapeMaker() {
        cricle = new Circle();
        square = new Square();
    }

    public void draw(String shape) {
        String trimmedShape = shape.trim();
        if (trimmedShape.equalsIgnoreCase("CIRCLE")) {
            cricle.draw();
        } else if (trimmedShape.equalsIgnoreCase("SQUARE")) {
            square.draw();
        } else {
            System.out.println("WRONG SHAPE!");
        }
    }
}
