package com.xcelerateDesign.java8Features;

/**
 * Functional Interface ========================================================
 * An interface with only single abstract method is called functional interface.
 * To use lambda expression in Java, we need to either create our own functional interface or
 * use the pre defined functional interface provided by Java.
 * While creating your own functional interface, mark it with @FunctionalInterface annotation,
 * this annotation is introduced in Java 8. Although its optional,
 * you should use it so that you get a compilation error
 * if the interface you marked with this annotation is not following the rules of functional interfaces.
 *
 * Default Method ========================================================
 * Java 8 allows the interfaces to have default and static methods.
 * The reason we have default methods in interfaces is to allow the developers to add new methods
 * to the interfaces without affecting the classes that implements these interfaces.
 * We can say that concept of default method is introduced in java 8 to add the new methods
 * in the existing interfaces in such a way so that they are backward compatible.
 * Backward compatibility is adding new features without breaking the old code.
 *
 * Static Method ========================================================
 * Static methods in interfaces are similar to the default methods except that
 * we cannot override these methods in the classes that implements these interfaces.
 * Shape is a functional interface having
 * draw - abstract method
 * defaultImpl - default method
 * staticImpl - static method
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