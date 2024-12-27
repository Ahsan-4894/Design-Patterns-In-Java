package StructuralPatterns.CompositePattern;

public class SimpleTask implements Task {
    private String title;

    public SimpleTask(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println(this.title);
    }
}
