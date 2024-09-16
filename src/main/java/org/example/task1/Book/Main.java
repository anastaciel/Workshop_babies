package org.example.task1.Book;

public class Main {
    public  static  void  main(String[] args) {

        Book book1 = new Book();

        book1.setName("Холодный дом");
        book1.setAuthor("Ч. Диккенс");
        book1.setYear(1860);

        String  name1 = book1.getName();
        String author1 = book1.getAuthor();
        int year1 = book1.getYear();

        book1.display();


    }
}
