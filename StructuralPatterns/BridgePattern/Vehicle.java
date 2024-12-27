package StructuralPatterns.BridgePattern;

public abstract class Vehicle {
    private Workshop workshop1;
    private Workshop workshop2;
    private String vehicleType;

    protected Vehicle(Workshop w1, Workshop w2, String vehicleType) {
        this.workshop1 = w1;
        this.workshop2 = w2;
        this.vehicleType = vehicleType;
    }

    final public void manufacture() {
        System.out.println(workshop1.getName() + " " + vehicleType + " AND " + workshop2.getName());
    }
}
