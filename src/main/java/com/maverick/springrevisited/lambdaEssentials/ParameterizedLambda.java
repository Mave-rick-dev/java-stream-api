package com.maverick.springrevisited.lambdaEssentials;

@FunctionalInterface
interface CarService{
    //parameterized abstract class
    String startEngine(String state);
}

@FunctionalInterface
interface Calculate{
    void sum(int num1, int num2);
}

public class ParameterizedLambda {


    public static void main(String[] args) {

        //CarService
        CarService carService = (state) ->
        {
            String suffixMsg = "The car has ";
            String cmpltMsg = suffixMsg.concat(state);
            System.out.println(cmpltMsg);
            return  cmpltMsg;
        };

        carService.startEngine("started.");
        carService.startEngine("stopped.");


        //Calculate
        Calculate calculate = (num1, num2) -> {
            int sum = num1 + num2;
            String prfxMsg = "The sum of given number is ";
            System.out.println(prfxMsg+sum);
        };

        calculate.sum(2, 3);
    }
}
