package com.maverick.springrevisited.stream.operations;

import com.maverick.springrevisited.streamAPIUseCase.Book;
import com.maverick.springrevisited.streamAPIUseCase.BookDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamSortDemo {

    /**
     * Suppose we want to sort a mutable list as below
     */
    public static void main(String[] args) {

        /*List<String> drinks = new ArrayList<>();
        drinks.add("Cocacola");
        drinks.add("Pepsi");
        drinks.add("Fanta");
        drinks.add("Dew");*/

        /**
         * Traditional approach (primitive datatype) for collection sort
         */

        /*Collections.sort(drinks);//in asc order (by default)
        System.out.println(drinks);*/

        /*Collections.reverse(drinks);//in desc order
        System.out.println(drinks);*/

        /**
         * Collection sort using Stream API
         */

       /* drinks.stream().sorted().forEach(drink -> System.out.println(drink));//in asc order
        drinks.stream().sorted(Comparator.reverseOrder()).forEach(drink -> System.out.println(drink));//in desc order*/

        /**
         * Custom sorting with a specific field
         */

        List<Book> books = BookDao.getAllBooks();
        System.out.println(books);

        Collections.sort(books, new MyComparator());
    }
}

class MyComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPages() - o2.getPages();//for asc order
    }
}