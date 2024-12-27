package BehavioralPatterns.MediatorPattern;

public class AirportControlTower implements AirTrafficControlTower {
    public void requestTakeoff(Airplane airplane) {
        // Logic for coordinating takeoff
        airplane.notifyAirTrafficControlTower("Requesting for takeoff!");
    }

    public void requestLanding(Airplane airplane) {
        // Logic for coordinating landing
        airplane.notifyAirTrafficControlTower("Requesting for landing!");
    }
}
