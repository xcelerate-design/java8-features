package com.xcelerateDesign.java8Features.functionalInterface;

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
@FunctionalInterface
public interface MyFunctionalInterface {

    // abstract method
    int addMethod(int val1, int val2);

}