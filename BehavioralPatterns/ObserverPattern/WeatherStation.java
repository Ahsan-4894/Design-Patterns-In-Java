package BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;

public class WeatherStation implements Subject { // this is concrete subject
    private ArrayList<Observer> listeners = new ArrayList<>(); // list of observers
    private String weather;

    public void addObserver(Observer o) {
        if (listeners.contains(o)) {
            System.out.println("Already added this obersvers!");
        }
        listeners.add(o);
    }

    public void removeObserver(Observer o) {
        if (!listeners.contains(o)) {
            System.out.println("No such observers exists!");
        }
        listeners.remove(o);
        o.updateWeather("flush");
    }

    public void notifyObservers() {
        for (Observer observer : listeners) {
            observer.updateWeather(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }

}
