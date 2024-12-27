package BehavioralPatterns.VisitorPattern;

public class TaxCalculator implements TaxVisitor {
    public void visit(Electronics e) {
        System.out.println("Tax on Electronics = " + (e.getPrice() * 0.2));
    }

    public void visit(Grocery g) {
        System.out.println("Tax on Grocery = " + (g.getPrice() * 0.1));
    }

    public void visit(Clothing c) {
        System.out.println("Tax on Clothing = " + (c.getPrice() * 0.15));
    }
}
