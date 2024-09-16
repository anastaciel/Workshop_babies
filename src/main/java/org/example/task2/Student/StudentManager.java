package org.example;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public  StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public void addStudent (Student student) {
        this.students.add(student);
    }

    public  void removeStudent( String id) {

        Student targetStudent = null;

        for (Student student: students ) {
            if (student.getId().equals(id)) {
                 targetStudent = student;
            }
        }

        if (targetStudent!= null) {
            students.remove(targetStudent);
        } else {
            System.out.println("Student with id " + id + "not found");
        }
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "students=" + students +
                '}';
    }
}
