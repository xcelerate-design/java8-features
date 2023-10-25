package com.xcelerateDesign.java8Features.methodReference;

/**
 * Multiplication is a class having its own method
 *
 */
public class Multiplication {

    public static void staticMultiplication() {
        System.out.println("Inside Multiplication - staticMultiplication method");
    }

    public static int staticMultiplicationReturn() {
        System.out.println("Inside Multiplication - staticMultiplicationReturn method");
        return 1;
    }

    public static int staticMultiplication(int val1) {
        System.out.print("Inside Multiplication - staticMultiplication method");
        return val1;
    }

    public static int staticMultiplication(int val1,int val2) {
        System.out.print("Inside Multiplication - staticMultiplication method");
        return val1 * val2;
    }

    Multiplication() {
        System.out.print("Inside Multiplication - constructor");
    }

    public void draw() {
        System.out.println("Inside Multiplication - draw method");
    }

}