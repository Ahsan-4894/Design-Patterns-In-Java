package BehavioralPatterns.MediatorPattern;

public interface Airplane {
    void requestTakeoff();

    void requestLanding();

    void notifyAirTrafficControlTower(String message);
}
