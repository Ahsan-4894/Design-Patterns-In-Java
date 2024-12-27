package StructuralPatterns.BridgePattern;

public class Car extends Vehicle {

    public Car(Workshop w1, Workshop w2) {
        super(w1, w2, "CAR");
    }
}
