package StructuralPatterns.DecoratorPattern;

public class Main {
    public static void main(String[] args) {

        // no adds-on
        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        // coffee with milk
        Coffee coffeeWithMilk = new MilkDecorator(new PlainCoffee());
        System.out.println(coffeeWithMilk.getCost());
        System.out.println(coffeeWithMilk.getDescription());

        // coffee with milk and sugar
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println(coffeeWithMilkAndSugar.getCost());
        System.out.println(coffeeWithMilkAndSugar.getDescription());
    }
}
