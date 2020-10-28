package com.xcelerateDesign.java8Features.defaultAndStaticMethod;

import com.xcelerateDesign.java8Features.defaultAndStaticMethod.Animal;

/**
 * Cow implements Animal functional interface
 * sound - overrides abstract method
 */
public class Cow implements Animal {

    @Override
    public void sound() {
        System.out.println("Inside Cow - sound method");
    }

}