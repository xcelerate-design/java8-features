package com.xcelerateDesign.java8Features.methodReference;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Method reference is a shorthand notation of a lambda expression to call a method.
 * The :: operator is used in method reference to separate the class or object from the method name
 * Four types of method references
 * 1. Method reference to a static method of a class – Class::staticMethod
 * 2. Method reference to a constructor – Class::new
 * 3. Method reference to an instance method of an object – object::instanceMethod
 * 4. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
 */
public class MethodReferenceExample {

    public static void main(String[] args) {

        // 1. use of static method reference
        MyInterface myInterface = Multiplication::staticMultiplication;
        myInterface.print();

        // 1. use of static method reference
        //methodReference = Multiplication::staticMultiplicationReturn;

        // 1. use of static method reference
        // Function is a functional interface
        Function<Integer, Integer> function = Multiplication::staticMultiplication;
        System.out.println(", return: " + function.apply(5));

        // 1. use of static method reference
        // BiFunction is a functional interface
        BiFunction<Integer, Integer, Integer> biFunction = Multiplication::staticMultiplication;
        System.out.println(", return: " + biFunction.apply(5,10));

        // 2. use of constructor method reference
        myInterface = Multiplication::new;
        myInterface.print();

        // 3. use of instance method reference
        myInterface = new Multiplication()::draw;
        myInterface.print();

        // 4. use of instance of an arbitrary object of a particular type method reference
        String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
        Arrays.parallelSort(stringArray, String::compareToIgnoreCase);
        Arrays.stream(stringArray).forEach(name -> System.out.println("Name: " + name));

    }

}