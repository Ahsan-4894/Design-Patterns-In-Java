package BehavioralPatterns.StatePattern;

public class VendingMachineContext {
    private VendingMachineStates currentState;

    public VendingMachineContext() {
        currentState = new ReadyState();
    }

    public void setState(VendingMachineStates state) {
        this.currentState = state;
    }

    public void request() {
        currentState.handleRequest();
    }

}
