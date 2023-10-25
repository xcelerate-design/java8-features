package com.xcelerateDesign.java8Features.collectorsClass;

import java.util.ArrayList;
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
            Arrays.asList("Manish", "Sandeep", "Keyur", "Sandeep", "Manish", "Manish");

        // count names and store names and count in map
        Map<String, Long> map = names.stream().collect(
            Collectors.groupingBy(
                Function.identity(), Collectors.counting()
            )
        );
        System.out.println(map);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1001, "Manish", "Modi", "India"));
        employeeList.add(new Employee(1002, "Sandeep", "Rana", "Oman"));
        employeeList.add(new Employee(1003, "Keyur", "Patel", "India"));

        // create list of fullnames
        List<String> fullNames = employeeList.stream()
            .map(employee -> employee.getFirstName() + " " + employee.getLastName())
            .collect(Collectors.toList());
        System.out.println(fullNames);

        // create list of employees those who are in India
        List<Employee> employeeIndiaList = employeeList.stream()
            .filter(employee -> "India".equalsIgnoreCase(employee.getCountry()))
            .collect(Collectors.toList());
        System.out.println(employeeIndiaList);

    }

}
