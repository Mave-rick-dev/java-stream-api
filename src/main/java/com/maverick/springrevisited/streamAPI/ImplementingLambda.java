package com.maverick.springrevisited.streamAPI;

interface CalculatorStarter{
    void startCalculator();
}

public class ImplementingLambda {

    //Traditional approach of calling an abstract method of an interface ***
    /*@Override
    public void startCalculator() {
        System.out.println("Calculator started!!");
    }*/



    public static void main(String[] args) {
        //Traditional approach
        /*ImplementingLambda implementingLambda = new ImplementingLambda(); ***
        implementingLambda.startCalculator();*/


        //Implementation of Lambda
        CalculatorStarter calculatorStarter = ()-> System.out.println("Calculation started!!");

        //Calling the lambda
        calculatorStarter.startCalculator();
    }
}
