package BehavioralPatterns.VisitorPattern;

public interface TaxVisitor {
    void visit(Electronics e);

    void visit(Grocery g);

    void visit(Clothing c);
}
