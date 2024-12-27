package BehavioralPatterns.TemplatePattern;

public class CoffeeMaker extends BeverageMaker {
    public void brew() {
        System.out.println("Steeping the coffee");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
