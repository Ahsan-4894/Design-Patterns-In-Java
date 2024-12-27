package BehavioralPatterns.VisitorPattern;

public interface Product {
    void accept(TaxVisitor visitor);
}
