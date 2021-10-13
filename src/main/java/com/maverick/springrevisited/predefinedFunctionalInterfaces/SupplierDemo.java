package com.maverick.springrevisited.predefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * Supplier Functional Interface has get() as its abstract method
 *  - It returns the result of type T as in Supplier<T>
 *  - And is devoid of any argument
 */
public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Got from the get()";
        System.out.println(supplier.get());
        supplier.get();
    }
}

class SupplierUseCase{

    public static void main(String[] args) {
        List<String> vowels = Arrays.asList();
                //List.of("a","e","i","o","u");
        /*vowels.stream()
                .filter(letter -> letter.equalsIgnoreCase("z"))
                .forEach(letter -> System.out.println(letter));*/

        /**
         * Here, orElse() returns the result as an Supplier<T> when no elements
         *  are present in the vowels stream
         */
        System.out.println(vowels.stream().findAny().orElse("No letters found!!"));
    }
}
