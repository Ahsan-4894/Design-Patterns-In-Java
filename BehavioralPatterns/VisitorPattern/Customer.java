package BehavioralPatterns.VisitorPattern;

public class Customer {
    public static void main(String[] args) {
        Product electronics = new Electronics(500);
        Product clothing = new Clothing(120);
        Product grocery = new Grocery(50);

        TaxVisitor taxCalculator = new TaxCalculator();

        electronics.accept(taxCalculator); // 2% of 500
        clothing.accept(taxCalculator); // 15% of 120
        grocery.accept(taxCalculator); // 1% of 50
    }
}
