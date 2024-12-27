package BehavioralPatterns.CommandPattern;

public class Stereo implements Device {
    public void turnOn() {
        System.out.println("Stereo is turned on");
    }

    public void turnOff() {
        System.out.println("Stereo is turned off");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}
