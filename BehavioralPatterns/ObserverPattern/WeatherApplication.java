package BehavioralPatterns.ObserverPattern;

public class WeatherApplication {
    public static void main(String[] args) {

        // Concrete Subject Instance
        WeatherStation weatherStation = new WeatherStation();

        // 1-way of instantiating Observers
        // Concrete Observers Instances
        // Observer Phone = new Phone();
        // Observer Desktop = new Desktop();

        // 2-way of instantiating Observers, using Factory Design Pattern
        Observer Phone = ObserverFactory.getObserver("PHONE");
        Observer Desktop = ObserverFactory.getObserver("DESKTOP");

        // Subscribing observers to Subject
        weatherStation.addObserver(Desktop);
        weatherStation.addObserver(Phone);

        // Simulating weather change
        weatherStation.setWeather("Sunny");

        System.out.println(Phone.getWeather()); // sunny
        System.out.println(Desktop.getWeather()); // sunny

        weatherStation.removeObserver(Phone);
        weatherStation.setWeather("Stormy");

        System.out.println(Phone.getWeather()); // flush
        System.out.println(Desktop.getWeather()); // Stormy

    }
}
