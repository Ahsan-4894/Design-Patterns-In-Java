package BehavioralPatterns.MediatorPattern;

public class CommercialAirplane implements Airplane {
    private AirTrafficControlTower mediator;

    public CommercialAirplane(AirTrafficControlTower mediator) {
        this.mediator = mediator;
    }

    public void requestTakeoff() {
        mediator.requestTakeoff(this);
    }

    public void requestLanding() {
        mediator.requestLanding(this);
    }

    public void notifyAirTrafficControlTower(String message) {
        System.out.println("Commercial Airplane: " + message);
    }

}
