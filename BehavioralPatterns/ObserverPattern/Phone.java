package BehavioralPatterns.ObserverPattern;

public class Phone implements Observer { // this is concrete observer
    private String weather;

    public void updateWeather(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }
}
