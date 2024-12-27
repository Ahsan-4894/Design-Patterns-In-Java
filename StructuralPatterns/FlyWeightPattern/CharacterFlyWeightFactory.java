package StructuralPatterns.FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyWeightFactory {
    private final Map<String, CharacterFlyWeight> characterCache = new HashMap<>();

    public CharacterFlyWeight getFlyweight(char character, String font, int size, boolean bold) {
        String key = character + "-" + font + "-" + size + "-" + bold;
        if (!characterCache.containsKey(key)) {
            characterCache.put(key, new CharacterFlyWeight(character, font, size, bold));
        }
        return characterCache.get(key);
    }

}
