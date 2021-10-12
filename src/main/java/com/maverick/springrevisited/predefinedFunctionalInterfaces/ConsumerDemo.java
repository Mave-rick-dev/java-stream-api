package com.maverick.springrevisited.predefinedFunctionalInterfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Functional method of Consumer Interface is accept(T), which accepts
 * any object as an argument and returns nothing.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
class SuperHero {
    private String power;
    private int rating;
}

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<SuperHero> superHeroConsumer = (superHeroName) -> {
            if (superHeroName.getPower().equalsIgnoreCase("super strength")) {
                System.out.println("It is Superman!!");
            } else {
                System.out.println("It is not Superman!!");
            }
        };
        superHeroConsumer.accept(new SuperHero("Water manipulation", 5));
        superHeroConsumer.accept(new SuperHero("Super strength", 10));
    }
}


/**
 * Consumer's functional method can be used to perform an operation on a stream of collection
 * when there is no need to return anything.
 * <p>
 * Below, we identify a superHero instance as superman or not.
 * - we use forEach() method, which accepts Consumer interface on the stream of superHero objects
 * - we define the implementations for accept() method using lambda expression
 */

class ConsumerUseCase {
    public static void main(String[] args) {
        List<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(new SuperHero("Superman", 10));
        superHeroes.add(new SuperHero("Batman", 8));
        superHeroes.add(new SuperHero("Green Lantern", 5));

        superHeroes.stream().forEach(superHero -> {
            if (superHero.getPower().equalsIgnoreCase("superman")) {
                System.out.println("It is superman!!");
            } else {
                System.out.println("It is not superman!!");
            }
        });
    }
}