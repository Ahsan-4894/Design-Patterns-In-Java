package StructuralPatterns.FlyWeightPattern;

public class TextEditor {
    public static void main(String[] args) {
        CharacterFlyWeightFactory factory = new CharacterFlyWeightFactory();

        // Render "HELLO" with shared flyweights
        String text = "HELLO";
        int x = 0, y = 0;
        for (char c : text.toCharArray()) {
            CharacterFlyWeight flyweight = factory.getFlyweight(c, "Arial", 12, false);
            flyweight.draw(x, y);
            x += 10; // Move to the next position
        }

        // Render "WORLD" with bold
        x = 0;
        y = 20;
        for (char c : "WORLD".toCharArray()) {
            CharacterFlyWeight flyweight = factory.getFlyweight(c, "Arial", 12, true);
            flyweight.draw(x, y);
            x += 10;
        }

    }
    // in this scenario only 9 objects will be created! instead of 10.
}
