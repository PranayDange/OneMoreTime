package com.example.onemoretime.constructors;

public class Person {

    //this is an example of how to assign the value to a variable using constructor in java


    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Other methods and variables go here...

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
