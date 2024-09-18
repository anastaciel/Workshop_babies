package org.example.task2.Task;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Разработка новой фичи", "Средний");
        Task task2 = new Task("Исправление критической ошибки", "Высокий");
        Task task3 = new Task("Исправление незначительной ошибки 1", "Низкий");
        Task task4 = new Task("Исправление незначительной ошибки 2", "Низкий");


        TaskManager tasks = new TaskManager();
        tasks.addTask(task1);
        tasks.addTask(task2);
        tasks.addTask(task3);
        tasks.addTask(task4);

        System.out.println(tasks.toString());

        tasks.removeTask(task3);
        System.out.println(tasks.toString());

        tasks.sort();


    }
}
