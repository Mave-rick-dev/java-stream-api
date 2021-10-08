package com.maverick.springrevisited.streamAPI;

@FunctionalInterface
interface CarService{
    //parameterized abstract class
    String startEngine(String state);
}

public class ParameterizedLambda {


    public static void main(String[] args) {

        CarService carService = (state) -> "The engine has "+state;
        System.out.println(carService.startEngine("started"));
        System.out.println(carService.startEngine("stopped"));

    }
}
