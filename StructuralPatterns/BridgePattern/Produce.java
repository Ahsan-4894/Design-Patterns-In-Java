package StructuralPatterns.BridgePattern;

public class Produce implements Workshop {
    private String name = "Produce";

    public void work() {
        System.out.print("Produced");
    }

    public String getName() {
        return name;
    }
}
