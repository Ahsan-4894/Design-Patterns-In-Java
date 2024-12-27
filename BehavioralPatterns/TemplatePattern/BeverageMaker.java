package BehavioralPatterns.TemplatePattern;

public abstract class BeverageMaker {

    public final void makeBeverage() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    abstract public void brew();

    abstract public void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
