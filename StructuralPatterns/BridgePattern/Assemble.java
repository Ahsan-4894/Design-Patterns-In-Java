package StructuralPatterns.BridgePattern;

public class Assemble implements Workshop {
    private String name = "Assemble";

    public void work() {
        System.out.print("Assembled");
    }

    public String getName() {
        return name;
    }
}
