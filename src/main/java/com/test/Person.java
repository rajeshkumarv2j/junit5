package com.test;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String jane, String doe) {
        firstName = jane;
        lastName =doe;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
