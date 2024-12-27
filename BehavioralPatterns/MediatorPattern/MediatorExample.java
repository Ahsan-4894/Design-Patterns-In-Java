package BehavioralPatterns.MediatorPattern;

public class MediatorExample {
    public static void main(String[] args) {
        AirTrafficControlTower controlTower = new AirportControlTower();

        Airplane airplane1 = new CommercialAirplane(controlTower);
        Airplane airplane2 = new CommercialAirplane(controlTower);

        airplane1.requestTakeoff();// Commercial Airplane: Requesting takeoff clearance.
        airplane2.requestLanding(); // Commercial Airplane: Requesting landing clearance.
    }
}
