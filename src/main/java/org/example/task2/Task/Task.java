package org.example.task2.Task;

public class Task {
    private String task;
    private String priority;

    public Task(String task, String priority) {
        this.task = task;
        this.priority = priority;
    }

    public String getTask() {
        return task;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
