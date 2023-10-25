package com.xcelerateDesign.java8Features.defaultAndStaticMethod;

/**
 * Default Method ========================================================
 * Java 8 allows the interfaces to have default and static methods.
 * The reason we have default methods in interfaces is to allow the developers to add new methods
 * to the interfaces without affecting the classes that implements these interfaces.
 * We can say that concept of default method is introduced in java 8 to add the new methods
 * in the existing interfaces in such a way so that they are backward compatible.
 * Backward compatibility is adding new features without breaking the old code.
 * Static Method ========================================================
 * Static methods in interfaces are similar to the default methods except that
 * we cannot override these methods in the classes that implements these interfaces.
 * Animal is an interface having
 * sound - abstract method
 * defaultImpl - default method
 * staticImpl - static method
 *
 */
public class DefaultAndStaticMethodExample {

    public static void main(String[] args) {

        // use default and static method
        Animal animal = new Cow();
        Animal.staticImpl();
        animal.sound();
        animal.defaultImpl();

        // use default and static method
        animal = new Dog();
        Animal.staticImpl();
        animal.sound();
        animal.defaultImpl();

    }

}