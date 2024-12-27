package BehavioralPatterns.StatePattern;

public class Client {
    public static void main(String[] args) {
        VendingMachineContext vendingMachineContext = new VendingMachineContext();
        vendingMachineContext.request(); // In ready state

        vendingMachineContext.setState(new ProductSelectedState());
        vendingMachineContext.request(); // In Product Selection State

        vendingMachineContext.setState(new PaymentPendingState());
        vendingMachineContext.request(); // In Payment Pending State

        vendingMachineContext.setState(new OutOfStockState());
        vendingMachineContext.request(); // In Out Of Stock State
    }
}
