package StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class TasksList implements Task {
    private List<Task> tasks;
    private String title;

    public TasksList(String title) {
        this.title = title;
        this.tasks = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void display() {
        for (Task task : tasks) {
            task.display();
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}
