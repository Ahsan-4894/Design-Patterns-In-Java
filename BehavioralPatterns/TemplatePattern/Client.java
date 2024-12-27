package BehavioralPatterns.TemplatePattern;

public class Client {
    public static void main(String[] args) {
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage(); // Output: Boiling water, Steeping the coffee, Adding sugar and milk, Pouring
                                    // into cup

        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage(); // Output: Boiling water, Steeping the tea, Adding lemon, Pouring into cup

    }
}
