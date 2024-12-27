package BehavioralPatterns.StatePattern;

public class ReadyState implements VendingMachineStates {
    public void handleRequest() {
        System.out.println("In ready state");
    }
}
