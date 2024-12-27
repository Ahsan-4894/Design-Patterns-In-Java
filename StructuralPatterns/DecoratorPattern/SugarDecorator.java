package StructuralPatterns.DecoratorPattern;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public int getCost() {
        return decoratedCoffee.getCost() + 10;
    };

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", SUGAR";
    }
}
