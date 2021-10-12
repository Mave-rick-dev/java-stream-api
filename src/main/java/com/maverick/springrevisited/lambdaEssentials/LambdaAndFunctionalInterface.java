package com.maverick.springrevisited.lambdaEssentials;

/**
 * Lambda expression: Java expression through which we can represent anonymous function
 *
 * Anonymous function: Nameless function i.e. devoid of name and modifier
 *
 * Syntax: Parameter    Expression  Body
 *          ()              ->      {System.out.println("Lymbda Syntax")}
 *
 * Example:
 *      - Traditional method: with name and modifier
 *      public String getName(){
 *          return this.name;
 *      }
 *
 *      - Anonymous function: without name and modifier
 *      (){
 *          System.out.println("Lambda expression");
 *      }
 *
 * Note: Lambda expression is only applicable for FunctionalInterface
 *
 * FunctionalInterface: When an interface has only one abstract method. But it can also have
 *                      multiple default and/or static methods
 *                      eg: Runnable(run()), Callable(call()), Comparable(compareTo()), Comparator(compare())
 */

//Not mandatory annot
@FunctionalInterface
public interface LambdaAndFunctionalInterface{
    String lambdaFunction();

   // void secondLambdaFunction();

     static String getCaller(){
        return "caller";
    }

    default void startPrinter(){
        System.out.println("Pinter started!!");
    }

}
