package StructuralPatterns.DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public int getCost() {
        return decoratedCoffee.getCost() + 20;
    };

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", MILK";
    }
}
