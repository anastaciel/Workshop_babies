package org.example.task2.Book;

import java.util.HashSet;

public class BookCollection {

    private HashSet <Book> books;

    public BookCollection(){
        this.books = new HashSet<>();
    }

    public void addBook (Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }
    public void bookContains (Book book){
        boolean res =  this.books.contains(book);
        if (res) {
            System.out.println("Книга есть в коллекции!");
        } else {
            System.out.println("Книги нет в коллекции :(");
        }
    }

    @Override
    public String toString() {
        return "BookCollection{" +
                "books=" + books +
                '}';
    }
}
