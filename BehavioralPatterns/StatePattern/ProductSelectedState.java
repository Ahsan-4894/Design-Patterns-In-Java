package BehavioralPatterns.StatePattern;

public class ProductSelectedState implements VendingMachineStates {
    public void handleRequest() {
        System.out.println("In Product Selection State");
    }
}
