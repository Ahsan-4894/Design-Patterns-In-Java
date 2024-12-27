package BehavioralPatterns.CommandPattern;

public class TV implements Device {

    public void turnOn() {
        System.out.println("TV is turned on");
    }

    public void turnOff() {
        System.out.println("TV is turned off");
    }

    public void changeChannel() {
        System.out.println("Channel changed");
    }
}
