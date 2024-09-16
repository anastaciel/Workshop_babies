package org.example.task1.Book;

public class Book implements  Displayable {

    private String name;
    private  String  author;
    private  int year;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Название книги - " + this.name + ", автор - " + this.author + ", год выпуска - "+ this.year);
    }
}
