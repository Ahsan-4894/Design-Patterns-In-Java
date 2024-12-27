package BehavioralPatterns.CommandPattern;

public class Client {
    public static void main(String[] args) {
        // Creating devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Creating commands
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOnCommand(tv);
        Command changeTVChannelCommand = new ChangeChannelCommand(tv);

        Command turnOnStereoCommand = new TurnOnCommand(stereo);
        Command turnOffStereoCommand = new TurnOnCommand(stereo);
        Command adjustStereoVolumeCommand = new AdjustVolumeCommand(stereo);

        // Creating the invoker (Remote Control)
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnTVCommand);
        remoteControl.pressButton(); // TV is turned on

        remoteControl.setCommand(turnOffTVCommand);
        remoteControl.pressButton(); // TV is turned off

        remoteControl.setCommand(changeTVChannelCommand);
        remoteControl.pressButton(); // Channel changed

        remoteControl.setCommand(turnOnStereoCommand);
        remoteControl.pressButton(); // Stereo is turned on

        remoteControl.setCommand(turnOffStereoCommand);
        remoteControl.pressButton(); // Stereo is turned off

        remoteControl.setCommand(adjustStereoVolumeCommand);
        remoteControl.pressButton(); // Volume adjusted
    }
}
