package org.example.task2.Student;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //если система такая, что id не меняется после создания студента
        Student student1 = new Student("Вика", "001");
        Student student2 = new Student("Коля", "002");
        System.out.println(student1);

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        System.out.println(studentManager);
        studentManager.removeStudent("001");
        System.out.println(studentManager.getStudents());
    }
}
