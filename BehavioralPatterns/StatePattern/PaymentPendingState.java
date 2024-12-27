package BehavioralPatterns.StatePattern;

public class PaymentPendingState implements VendingMachineStates {
    public void handleRequest() {
        System.out.println("In Payment Pending State ");
    }
}
