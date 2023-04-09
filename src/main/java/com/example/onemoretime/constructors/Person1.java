package com.example.onemoretime.constructors;

public class Person1 {

    //this is an example of how to assign the value to a variable using getters and setters in java


    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Other methods go here...
}

