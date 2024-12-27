package BehavioralPatterns.TemplatePattern;

public class TeaMaker extends BeverageMaker {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
