package BehavioralPatterns.CommandPattern;

public class ChangeChannelCommand implements Command {
    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.changeChannel();
    }
}
