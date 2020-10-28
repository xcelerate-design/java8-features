package com.xcelerateDesign.java8Features;

import com.xcelerateDesign.java8Features.lambdaExpression.Shape;

/**
 * Rectangle implements Shape functional interface
 * draw - overrides abstract method
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle - draw method");
    }

}