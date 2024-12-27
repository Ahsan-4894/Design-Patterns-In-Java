package StructuralPatterns.BridgePattern;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike(new Produce(), new Assemble());
        bike.manufacture();// Produce Bike AND Assemble

        Vehicle car = new Car(new Produce(), new Assemble());
        car.manufacture();// Produce Car AND Assemble
    }
}
