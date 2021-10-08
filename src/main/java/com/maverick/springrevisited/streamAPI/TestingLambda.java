package com.maverick.springrevisited.streamAPI;


@FunctionalInterface
interface FnctnlIntrfc{
    //abstract method
    void abstrctMthd();
}

public class TestingLambda {

    //implementing lambda at class level
    FnctnlIntrfc fnctnlIntrfc1 = () -> System.out.println("\nCalling labda through class!!");

    public static void main(String[] args) {

        TestingLambda testingLambda = new TestingLambda();
        testingLambda.fnctnlIntrfc1.abstrctMthd();

        FnctnlIntrfc fnctnlIntrfc = () -> System.out.println("\n calling lambda directly!!");
        fnctnlIntrfc.abstrctMthd();
    }

}
