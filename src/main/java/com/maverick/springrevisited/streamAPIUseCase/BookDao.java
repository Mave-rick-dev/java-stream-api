package com.maverick.springrevisited.streamAPIUseCase;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public static List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Zystery of Black Holes", 200));
        books.add(new Book(2, "Psycho-analytics essentials", 300));
        books.add( new Book(3, "Statistical science", 500));
        return books;
       /* return List.of(
                new Book(1, "Mystery of Black Holes", 200),
                new Book(2, "Psycho-analytics essentials", 300),
                new Book(3, "Statistical science", 500)
        );*/
    }
}
