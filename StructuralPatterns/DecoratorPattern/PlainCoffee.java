package StructuralPatterns.DecoratorPattern;

public class PlainCoffee implements Coffee {
    public int getCost() {
        return 100;
    };

    public String getDescription() {
        return "A plain Coffee";
    }
}
