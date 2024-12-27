package BehavioralPatterns.VisitorPattern;

public class Electronics implements Product {
    private double price;

    public Electronics(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void accept(TaxVisitor visitor) {
        visitor.visit(this);
    }
}
