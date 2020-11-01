package com.xcelerateDesign.java8Features.optionalClass;

import java.util.Optional;

/**
 * Optional class in java.util package.
 * This class is introduced to avoid NullPointerException that we frequently encounters
 * if we do not perform null checks in our code.
 * Using this class we can easily check whether a variable has null value or not
 * and by doing this we can avoid the NullPointerException.
 */
public class OptionalClassExample {

    public static void main(String[] args) {

        String[] str = new String[10];
        // below line will throw exception: Exception in thread "main" java.lang.NullPointerException
        //System.out.println(str[5].toLowerCase());

        // using optional
        Optional<String> optional = Optional.ofNullable(str[5]);

        // if value is not present, value provided in orElse will be printed
        System.out.println(optional.orElse("Default value"));

        // ifPresent will check value is present or not, if present then value will be printed
        optional.ifPresent(System.out::println);

        str[5] = "I have value now";
        optional = Optional.of(str[5]);

        // printing value by using get method
        System.out.println(optional.get());

        // if value is not present, value provided in orElse will be printed
        System.out.println(optional.orElse("Default value"));









    }
}
