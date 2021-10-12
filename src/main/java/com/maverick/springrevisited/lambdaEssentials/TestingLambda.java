package com.maverick.springrevisited.lambdaEssentials;

@FunctionalInterface
interface Welcome{
    void printHello();
}

@FunctionalInterface
interface ValidateCandidate{
    boolean isEligible(int age, double height);
}

public class TestingLambda {


    public static void main(String[] args) {

        Welcome welcome = ()-> System.out.println("Hello World!!");
        welcome.printHello();

        ValidateCandidate validateCandidate = (age, height)-> {
            if(age >= 25 && height >=6.0){
                return true;
            }
            return false;
        };

        boolean isEligible = validateCandidate.isEligible(14,5.8);
        boolean isEligible2 = validateCandidate.isEligible(28, 6.1);
        System.out.println(isEligible);
        System.out.println(isEligible2);
    }

}
