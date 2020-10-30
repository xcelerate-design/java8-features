package com.xcelerateDesign.java8Features.stringJoinerClass;

import java.util.StringJoiner;

/**
 * In java 8, a new class StringJoiner is introduced in the java.util package.
 * Using this class we can join more than one strings with the specified delimiter,
 * we can also provide prefix and suffix to the final string while joining multiple strings.
 */
public class StringJoinerClassExample {

    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner("-", "[", "]");

        stringJoiner.add("First");
        stringJoiner.add("Second");
        stringJoiner.add("Third");

        System.out.println(stringJoiner);

    }

}