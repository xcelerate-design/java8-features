package com.xcelerateDesign.java8Features.lambdaExpression;

import java.util.Arrays;
import java.util.List;

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
public class LambdaExpressionExample {

    public static void main(String[] args) {

        // to create anonymous class prior to java 8
        Shape shape = new Shape() {
            @Override
            public void draw() {
                System.out.println("Inside anonymous class - draw method");
            }
        };
        shape.draw();

        // to create anonymous class using lambda
        Shape shapeLambda = () -> System.out.println("Inside anonymous class using lambda - draw method");
        shapeLambda.draw();
        shapeLambda.defaultImpl();
        Shape.staticImpl();

        List<String> names = Arrays.asList("Manish", "Sandeep", "Keyur");

        // use forEach prior to java 8
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // use lambda with forEach
        names.forEach(
                name -> System.out.println("Name: " + name)
        );

    }

}
