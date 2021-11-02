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
        List<String> names = new ArrayList<>();

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
        drinks.stream().sorted(Comparator.reverseOrder())
            .forEach(drink -> System.out.println(drink));//in desc order*/

        /**
         * Custom sorting with a specific field
         */

        List<Book> books = BookDao.getAllBooks();

        //Collections.sort(books, new MyComparator());
        //System.out.println(books);

        /*Collections.sort(books, (book1, book2)->
             book2.getPages() - book1.getPages()
        );
        System.out.println(books);*/

        /**
         * Stream sorting:
         *  - uses Comparator<T> to print book in asc order
         */
        books.stream()
                .sorted((book1, book2) -> book2.getPages() - book1.getPages());
                //.sorted(Comparator.comparingInt(Book::getPages))//asc
                //.forEach(book -> System.out.println(book));
                //.forEach(System.out::println);//alternative to above forEach

        /**
         * Functional method of java.util.function.Function: R apply(T t)
         *  - R = return type of the function
         *  - T = method argument type
         * i.e. Function interface defines a generic function with
         *  method argument of type T which returns type of R
         *
         *  comparing(Function<T>)
         *  - Book::getName = sort by name (asc)
         *  - Book::getId = sort by id (asc)
         *  - Book::getPages = sort by pages (asc)
         */


        books.stream()
                .sorted(Comparator.comparing(Book::getName))
                .forEach(System.out::println);
    }
}

class MyComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPages() - o2.getPages();//for asc order
    }
}