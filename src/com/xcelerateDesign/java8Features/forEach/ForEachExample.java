package com.xcelerateDesign.java8Features.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * forEach method to iterate over collections and Streams in Java.
 * @author xcelerate-design
 */
public class ForEachExample {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Mango");

        // lambda expression in forEach Method for list
        fruits.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Monkey");
        map.put(2, "Dog");
        map.put(3, "Cat");
        map.put(4, "Lion");
        map.put(5, "Tiger");
        map.put(6, "Bear");

        // lambda expression in forEach Method for map
        map.forEach(
            (key, value) -> {
                if ("Cat".equals(value)) {
                    System.out.println("Key associated with 'Cat' is: " + key);
            }
        });

    }

}