package org.example.task2.Book;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Моя кузина Рейчел", "Дафна Дюморье");
        Book book2 = new Book("Грозовой перевал", "Эмили Бронте");
        Book book3 = new Book("Маленькая жизнь", "Ханья Янагихара");

        System.out.println(book1.toString());

        BookCollection books = new BookCollection();

        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);

        System.out.println(books.toString());

        books.removeBook(book3);

        System.out.println(books.toString());

        books.bookContains(book1);
        books.bookContains(book3);
    }
}
