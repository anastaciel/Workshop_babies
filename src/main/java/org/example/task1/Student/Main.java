package org.example.task1.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Елена");
        student1.setNumber(167481);
        student1.setAverage_mark(4.5F);

        String  name1 = student1.getName();
        int number1 = student1.getNumber();
        float average_mark = student1.getAverage_mark();

        student1.print();
    }
}
