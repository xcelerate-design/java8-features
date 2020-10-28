package com.xcelerateDesign.java8Features.defaultAndStaticMethod;

import com.xcelerateDesign.java8Features.defaultAndStaticMethod.Animal;

/**
 * Dog implements Animal functional interface
 * sound - overrides abstract method
 */
public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Inside Dog - sound method");
    }

}