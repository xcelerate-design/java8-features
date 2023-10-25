package com.xcelerateDesign.java8Features.lambdaExpression;

/**
 * Lambda expression is a new feature which is introduced in Java 8.
 * A lambda expression is an anonymous function.
 * A function that does not have a name and does not belong to any class.
 * To create a lambda expression,
 * we specify input parameters (if there are any) on the left side of the lambda operator ->,
 * and place the expression or block of statements on the right side of lambda operator.
 * For example,
 * the lambda expression (x, y) -> x + y specifies that lambda expression takes two arguments x and y and
 * returns the sum of these.
 */
@FunctionalInterface
public interface Shape {

    // abstract method
    void draw();

    // default method
    default void defaultImpl() {
        System.out.println("Inside Shape - defaultImpl method");
    }

    // static method
    static void staticImpl() {
        System.out.println("Inside Shape - staticImpl method");
    }

}
