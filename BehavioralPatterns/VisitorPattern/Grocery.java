package BehavioralPatterns.VisitorPattern;

public class Grocery implements Product {
    private double price;

    public Grocery(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void accept(TaxVisitor visitor) {
        visitor.visit(this);
    }

}
