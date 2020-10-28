package com.xcelerateDesign.java8Features.functionalInterface;

import java.util.function.IntBinaryOperator;

/**
 * Functional Interface ========================================================
 * An interface with only single abstract method is called functional interface.
 * To use lambda expression in Java, we need to either create our own functional interface or
 * use the pre defined functional interface provided by Java.
 * While creating your own functional interface, mark it with @FunctionalInterface annotation,
 * this annotation is introduced in Java 8. Although its optional,
 * you should use it so that you get a compilation error
 * if the interface we marked with this annotation is not following the rules of functional interfaces.
 */
public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        // using our own functional interface
        MyFunctionalInterface myFunctionalInterface = Integer::sum;
        System.out.println("Result: " + myFunctionalInterface.addMethod(5, 10));

        // using predefined functional interface
        IntBinaryOperator intBinaryOperator = Integer::sum;
        System.out.println("Result: " + intBinaryOperator.applyAsInt(5, 10));

    }

}