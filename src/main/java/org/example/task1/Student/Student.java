package org.example.task1.Student;

public class Student implements Printable{

    private String name;
    private  int number;
    private  float average_mark;

    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setAverage_mark(float average_mark){
        this.average_mark = average_mark;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return  number;
    }
    public float getAverage_mark(){
        return average_mark;
    }
    @Override
    public void print() {

        System.out.println("Имя студента - " + name + ", номер зачетной книжки - " + number + ", средний балл - " + average_mark);
    }
}
