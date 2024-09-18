package org.example.task2.Student;

public class Student {
    private  String name;
    private  String id;

    public Student() {
        this.name = "unknown";
        this.id = "unknown";
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

