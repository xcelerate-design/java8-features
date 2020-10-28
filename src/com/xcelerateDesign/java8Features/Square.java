package com.xcelerateDesign.java8Features;

import com.xcelerateDesign.java8Features.lambdaExpression.Shape;

/**
 * Square implements Shape functional interface
 * draw - overrides abstract method
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square - draw method");
    }

}