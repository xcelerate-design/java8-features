package com.xcelerateDesign.java8Features.streamApiAndFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Stream API =======================================================
 * Stream API which is another new feature of java 8.
 * All the classes and interfaces of this API is in the java.util.stream package.
 * By using streams we can perform various aggregate operations on the data returned from collections, arrays, Input/Output operations.
 * filter() =========================================================
 * The filter() is an intermediate operation that reads the data from a stream
 * and returns a new stream after transforming the data based on the given condition.
 */
public class StreamApiExample {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1001, "Manish", "Modi", "India"));
        employeeList.add(new Employee(1002, "Sandeep", "Rana", "Oman"));
        employeeList.add(new Employee(1003, "Keyur", "Patel", "India"));

        // count employees are there in India prior to java 8
        long count = 0;
        for (Employee employee : employeeList) {
            if ("India".equalsIgnoreCase(employee.getCountry())) {
                count++;
            }
        }
        System.out.println("There are " + count + "employees in India");

        // count employees are there in India using stream api and filter
        count = employeeList.stream().filter(employee -> "India".equalsIgnoreCase(employee.getCountry())).count();
        System.out.println("There are " + count + "employees in India");

        List<Employee> employeeNewList = employeeList.stream()
            .filter(employee ->
                "India".equalsIgnoreCase(employee.getCountry())
                && employee.getFirstName().startsWith("S")
            )
            .collect(Collectors.toList());

        /*
        the stream() method returns a stream of all the employees,
        the filter() method returns another stream of names with length less than 6,
        the count() method reduces this stream to the result.
        All these operations are happening in parallel which means we are able to parallelize the code with the help of streams.
        Parallel execution of operations using stream is faster than sequential execution without using streams.
        */

        // verify any employee is there in 'Oman' and name starts with 'S'
        Predicate<Employee> p1 = employee -> employee.getFirstName().startsWith("S") && "India".equalsIgnoreCase(employee.getCountry());
        boolean b1 = employeeList.stream().anyMatch(p1);

        // verify all employees are there in 'India'
        Predicate<Employee> p2 = employee -> "India".equalsIgnoreCase(employee.getCountry());
        boolean b2 = employeeList.stream().allMatch(p2);

        // verify none of employee is there in 'Canada'
        Predicate<Employee> p3 = employee -> "Canada".equalsIgnoreCase(employee.getCountry());
        boolean b3 = employeeList.stream().noneMatch(p3);

    }

}
