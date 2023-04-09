package com.example.onemoretime.constructors;

public class Person1Main {
    public static void main(String[] args) {

        Person1 john = new Person1("John Smith", 30);
        System.out.println(john.getName()); // Output: "John Smith"
        System.out.println(john.getAge()); // Output: 30

        john.setName("Johnny");
        john.setAge(31);
        System.out.println(john.getName()); // Output: "Johnny"
        System.out.println(john.getAge()); // Output: 31

    }
}
