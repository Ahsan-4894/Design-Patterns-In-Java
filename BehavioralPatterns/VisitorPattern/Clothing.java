package BehavioralPatterns.VisitorPattern;

public class Clothing implements Product {
    private double price;

    public Clothing(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void accept(TaxVisitor visitor) {
        visitor.visit(this);
    }
}
