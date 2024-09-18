package org.example.task2.Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager(){
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(Task task){
        this.tasks.add(task);
    }

    public void removeTask(Task task){
        this.tasks.remove(task);
    }

    public void sort() {
        tasks.sort(Comparator.comparing(Task::getPriority));
        System.out.println(tasks);
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + tasks +
                '}';
    }
}
