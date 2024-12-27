package StructuralPatterns.FlyWeightPattern;

public class CharacterFlyWeight implements RenderInterface {
    // Intrinsic state
    private final char character;
    private final String font;
    private final int size;
    private final boolean bold;

    public CharacterFlyWeight(char character, String font, int size, boolean bold) {
        this.character = character;
        this.font = font;
        this.size = size;
        this.bold = bold;
    }

    public void draw(int x, int y) {
        System.out.println("Rendering character '" + character + "' at (" + x + ", " + y +
                ") in font: " + font + ", size: " + size + ", bold: " + bold);
    }

};
