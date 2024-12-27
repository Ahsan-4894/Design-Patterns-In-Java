package BehavioralPatterns.StatePattern;

public class OutOfStockState implements VendingMachineStates {
    public void handleRequest() {
        System.out.println("In Out Of Stock State");
    }
}
