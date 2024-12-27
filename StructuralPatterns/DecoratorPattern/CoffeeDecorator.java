package StructuralPatterns.DecoratorPattern;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee = null;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public int getCost() {
        return decoratedCoffee.getCost();
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

}
