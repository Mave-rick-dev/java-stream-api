package com.maverick.springrevisited.streamAPIUseCase;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    /**
     * Here, we describe the sorting logic to be applied to the list
     * of books we obtain from the database
     */

    public List<Book> getAllBooks(){
        List<Book> books = new BookDao().getAllBooks();
        Collections.sort(books, (book1, book2)->book2.getName().compareTo(book1.getName()));
        return books;
    }
    public List<Book> inReverse(){
        List<Book> books = new BookDao().getAllBooks();
        Collections.reverse(books);
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getAllBooks());
    }
}



