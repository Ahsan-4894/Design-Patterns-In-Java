package BehavioralPatterns.ObserverPattern;

public class ObserverFactory {
    public static Observer getObserver(String type) {
        String trimmedType = type.trim();
        if (trimmedType.equalsIgnoreCase("phone")) {
            return new Phone();
        } else if (trimmedType.equalsIgnoreCase("desktop")) {
            return new Desktop();
        } else {
            return null;
        }
    }
}
