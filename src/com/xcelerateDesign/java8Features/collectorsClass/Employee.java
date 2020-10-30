package com.xcelerateDesign.java8Features.collectorsClass;

public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String country;

    public Employee(Integer id, String firstName, String lastName, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", country='" + country + '\'' +
            '}';
    }
}
