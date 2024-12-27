package StructuralPatterns.FacadePattern;

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker sm = new ShapeMaker();

        sm.draw("circle"); // CIRCLE::DRAW

        sm.draw("square"); // SQUARE::DRAW

        sm.draw("rectangle"); // WRONG SHAPE!

    }
}
