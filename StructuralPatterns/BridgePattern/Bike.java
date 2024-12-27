package StructuralPatterns.BridgePattern;

public class Bike extends Vehicle {
    public Bike(Workshop w1, Workshop w2) {
        super(w1, w2, "Bike");
    }
}
