package com.xcelerateDesign.java8Features.collectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Collectors is a final class that extends the Object class.
 * Java Stream collectors class using lambda expressions, Java Streams and other new features of Java 8.
 */
public class CollectorsClassExample {

    public static void main(String[] args) {

        List<String> names =
            Arrays.asList("Jon", "Ajeet", "Steve", "Ajeet", "Jon", "Ajeet");

        Map<String, Long> map = names.stream().collect(
            Collectors.groupingBy(
                Function.identity(), Collectors.counting()
            )
        );
        System.out.println(map);

    }

}